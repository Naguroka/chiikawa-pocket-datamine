package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzn implements com.google.android.gms.common.api.Api.ApiOptions.Optional, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions {
    public final int zze;
    public final java.util.ArrayList zzg;
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount zzk;
    public final java.lang.String zzn;
    public final com.google.android.gms.games.internal.zzl zzo;
    public final boolean zza = false;
    public final boolean zzb = true;
    public final int zzc = 17;
    public final boolean zzd = false;
    public final java.lang.String zzf = null;
    public final boolean zzh = false;
    public final boolean zzi = false;
    public final boolean zzj = false;
    public final java.lang.String zzl = null;
    private final int zzp = 0;
    public final int zzm = 9;

    /* synthetic */ zzn(boolean z, boolean z2, int i, boolean z3, int i2, java.lang.String str, java.util.ArrayList arrayList, boolean z4, boolean z5, boolean z6, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, java.lang.String str2, int i3, int i4, java.lang.String str3, com.google.android.gms.games.internal.zzl zzlVar, com.google.android.gms.games.zzm zzmVar) {
        this.zze = i2;
        this.zzg = arrayList;
        this.zzk = googleSignInAccount;
        this.zzn = str3;
        this.zzo = zzlVar;
    }

    public static com.google.android.gms.games.zzl zzb() {
        return new com.google.android.gms.games.zzl(null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.games.zzn)) {
            return false;
        }
        com.google.android.gms.games.zzn zznVar = (com.google.android.gms.games.zzn) obj;
        boolean z = zznVar.zza;
        boolean z2 = zznVar.zzb;
        int i = zznVar.zzc;
        boolean z3 = zznVar.zzd;
        if (this.zze == zznVar.zze) {
            java.lang.String str = zznVar.zzf;
            if (this.zzg.equals(zznVar.zzg)) {
                boolean z4 = zznVar.zzh;
                boolean z5 = zznVar.zzi;
                boolean z6 = zznVar.zzj;
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = this.zzk;
                if (googleSignInAccount != null ? googleSignInAccount.equals(zznVar.zzk) : zznVar.zzk == null) {
                    java.lang.String str2 = zznVar.zzl;
                    if (android.text.TextUtils.equals(null, null)) {
                        int i2 = zznVar.zzp;
                        int i3 = zznVar.zzm;
                        if (com.google.android.gms.common.internal.Objects.equal(this.zzn, zznVar.zzn)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    public final int getExtensionType() {
        return 1;
    }

    @Override // com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzk;
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    public final java.util.List getImpliedScopes() {
        return java.util.Collections.singletonList(com.google.android.gms.games.Games.zzc);
    }

    public final int hashCode() {
        int iHashCode = (((this.zze + 486741695) * 961) + this.zzg.hashCode()) * 923521;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = this.zzk;
        int iHashCode2 = (((iHashCode + (googleSignInAccount == null ? 0 : googleSignInAccount.hashCode())) * 29791) + 9) * 31;
        java.lang.String str = this.zzn;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension
    public final android.os.Bundle toBundle() {
        return zza();
    }

    public final android.os.Bundle zza() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", false);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", true);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", 17);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", false);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", this.zze);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", null);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.zzg);
        bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", false);
        bundle.putBoolean("com.google.android.gms.games.key.skipPgaCheck", false);
        bundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", false);
        bundle.putParcelable("com.google.android.gms.games.key.googleSignInAccount", this.zzk);
        bundle.putString("com.google.android.gms.games.key.realClientPackageName", null);
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
        bundle.putString("com.google.android.gms.games.key.gameRunToken", this.zzn);
        return bundle;
    }
}
