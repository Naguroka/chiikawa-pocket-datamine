package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzfe<MessageType extends com.google.android.gms.internal.play_billing.zzfi<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.play_billing.zzfe<MessageType, BuilderType>> extends com.google.android.gms.internal.play_billing.zzdr<MessageType, BuilderType> {
    protected com.google.android.gms.internal.play_billing.zzfi zza;
    private final com.google.android.gms.internal.play_billing.zzfi zzb;

    protected zzfe(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzz()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzo();
    }

    private static void zza(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.zzgs.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdr
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.zzfe clone() {
        com.google.android.gms.internal.play_billing.zzfe zzfeVar = (com.google.android.gms.internal.play_billing.zzfe) this.zzb.zzb(5, null, null);
        zzfeVar.zza = zzg();
        return zzfeVar;
    }

    public final com.google.android.gms.internal.play_billing.zzfe zzd(com.google.android.gms.internal.play_billing.zzfi zzfiVar) {
        if (!this.zzb.equals(zzfiVar)) {
            if (!this.zza.zzz()) {
                zzj();
            }
            zza(this.zza, zzfiVar);
        }
        return this;
    }

    public final MessageType zze() {
        MessageType messagetype = (MessageType) zzg();
        if (messagetype.zzk()) {
            return messagetype;
        }
        throw new com.google.android.gms.internal.play_billing.zzhg(messagetype);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public MessageType zzg() {
        if (!this.zza.zzz()) {
            return (MessageType) this.zza;
        }
        this.zza.zzu();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.zzgl zzh() {
        throw null;
    }

    protected final void zzi() {
        if (this.zza.zzz()) {
            return;
        }
        zzj();
    }

    protected void zzj() {
        com.google.android.gms.internal.play_billing.zzfi zzfiVarZzo = this.zzb.zzo();
        zza(zzfiVarZzo, this.zza);
        this.zza = zzfiVarZzo;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final boolean zzk() {
        return com.google.android.gms.internal.play_billing.zzfi.zzA(this.zza, false);
    }
}
