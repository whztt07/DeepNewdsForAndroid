package com.google.android.gms.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzdyt extends WeakReference<Throwable> {
    private final int zzmmk;

    public zzdyt(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th != null) {
            this.zzmmk = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass() == zzdyt.class) {
                if (this == obj) {
                    return true;
                }
                zzdyt zzdyt = (zzdyt) obj;
                return this.zzmmk == zzdyt.zzmmk && get() == zzdyt.get();
            }
        }
    }

    public final int hashCode() {
        return this.zzmmk;
    }
}
