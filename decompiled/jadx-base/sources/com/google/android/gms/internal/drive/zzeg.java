package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzeg extends com.google.android.gms.internal.drive.zzir {
    private final android.content.Context zzgw;

    private zzeg(android.os.Looper looper, android.content.Context context) {
        super(looper);
        this.zzgw = context;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            android.util.Pair pair = (android.util.Pair) message.obj;
            com.google.android.gms.drive.events.zzi zziVar = (com.google.android.gms.drive.events.zzi) pair.first;
            com.google.android.gms.drive.events.DriveEvent driveEvent = (com.google.android.gms.drive.events.DriveEvent) pair.second;
            int type = driveEvent.getType();
            if (type == 1) {
                ((com.google.android.gms.drive.events.ChangeListener) zziVar).onChange((com.google.android.gms.drive.events.ChangeEvent) driveEvent);
                return;
            }
            if (type == 2) {
                ((com.google.android.gms.drive.events.CompletionListener) zziVar).onCompletion((com.google.android.gms.drive.events.CompletionEvent) driveEvent);
                return;
            }
            if (type != 3) {
                if (type == 4) {
                    ((com.google.android.gms.drive.events.zzd) zziVar).zza((com.google.android.gms.drive.events.zzb) driveEvent);
                    return;
                } else if (type != 8) {
                    com.google.android.gms.internal.drive.zzee.zzbz.wfmt("EventCallback", "Unexpected event: %s", driveEvent);
                    return;
                } else {
                    ((com.google.android.gms.drive.events.zzl) zziVar).zza(new com.google.android.gms.internal.drive.zze(((com.google.android.gms.drive.events.zzr) driveEvent).zzac()));
                    return;
                }
            }
            com.google.android.gms.drive.events.zzq zzqVar = (com.google.android.gms.drive.events.zzq) zziVar;
            com.google.android.gms.drive.events.zzo zzoVar = (com.google.android.gms.drive.events.zzo) driveEvent;
            com.google.android.gms.common.data.DataHolder dataHolderZzz = zzoVar.zzz();
            if (dataHolderZzz != null) {
                zzqVar.zza(new com.google.android.gms.internal.drive.zzeh(new com.google.android.gms.drive.MetadataBuffer(dataHolderZzz)));
            }
            if (zzoVar.zzaa()) {
                zzqVar.zzc(zzoVar.zzab());
                return;
            }
            return;
        }
        com.google.android.gms.internal.drive.zzee.zzbz.efmt("EventCallback", "Don't know how to handle this event in context %s", this.zzgw);
    }
}
