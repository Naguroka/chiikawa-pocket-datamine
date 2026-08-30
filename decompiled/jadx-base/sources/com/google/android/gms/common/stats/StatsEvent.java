package com.google.android.gms.common.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public abstract class StatsEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface Types {
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public final java.lang.String toString() {
        return zzb() + "\t" + zza() + "\t-1" + zzc();
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract java.lang.String zzc();
}
