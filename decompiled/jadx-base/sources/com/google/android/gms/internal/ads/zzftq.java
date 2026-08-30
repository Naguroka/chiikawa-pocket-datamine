package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzftq {
    private static final com.google.android.gms.internal.ads.zzfto zza = new com.google.android.gms.internal.ads.zzfto("PhoneskyVerificationUtils");

    public static boolean zza(android.content.Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        zza.zzd("Play Store package is not signed -- possibly self-built package. Could not verify.", new java.lang.Object[0]);
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (android.content.pm.Signature signature : signatureArr) {
                            java.lang.String strZza = com.google.android.gms.internal.ads.zzftp.zza(signature.toByteArray());
                            arrayList.add(strZza);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strZza) || ((android.os.Build.TAGS.contains("dev-keys") || android.os.Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strZza))) {
                                return true;
                            }
                        }
                        com.google.android.gms.internal.ads.zzfto zzftoVar = zza;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.util.Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((java.lang.CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((java.lang.CharSequence) ", ");
                            }
                        }
                        objArr[0] = sb.toString();
                        zzftoVar.zzd(java.lang.String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", objArr), new java.lang.Object[0]);
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    zza.zzd("Play Store package is not found.", new java.lang.Object[0]);
                }
            } else {
                zza.zzd("Play Store package is disabled.", new java.lang.Object[0]);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            zza.zzd("Play Store package is not found.", new java.lang.Object[0]);
        }
        return false;
    }
}
