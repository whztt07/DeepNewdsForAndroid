package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

final class zzq implements Runnable {
    private final zzp zzfux;
    final /* synthetic */ zzo zzfuy;

    zzq(zzo zzo, zzp zzp) {
        this.zzfuy = zzo;
        this.zzfux = zzp;
    }

    public final void run() {
        if (this.zzfuy.mStarted) {
            ConnectionResult zzain = this.zzfux.zzain();
            LifecycleCallback lifecycleCallback;
            if (zzain.hasResolution()) {
                lifecycleCallback = this.zzfuy;
                lifecycleCallback.zzgam.startActivityForResult(GoogleApiActivity.zza(lifecycleCallback.getActivity(), zzain.getResolution(), this.zzfux.zzaim(), false), 1);
            } else if (this.zzfuy.zzftg.isUserResolvableError(zzain.getErrorCode())) {
                lifecycleCallback = this.zzfuy;
                lifecycleCallback.zzftg.zza(lifecycleCallback.getActivity(), this.zzfuy.zzgam, zzain.getErrorCode(), 2, this.zzfuy);
            } else if (zzain.getErrorCode() == 18) {
                GoogleApiAvailability.zza(this.zzfuy.getActivity().getApplicationContext(), new zzr(this, GoogleApiAvailability.zza(this.zzfuy.getActivity(), this.zzfuy)));
            } else {
                this.zzfuy.zza(zzain, this.zzfux.zzaim());
            }
        }
    }
}
