package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbka {
    public static final android.content.Intent zza(android.net.Uri uri, android.content.Context context, com.google.android.gms.internal.ads.zzava zzavaVar, android.view.View view, com.google.android.gms.internal.ads.zzfcn zzfcnVar) {
        if (uri == null) {
            return null;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final android.content.Intent zzb(android.content.Intent intent, android.content.pm.ResolveInfo resolveInfo, android.content.Context context, com.google.android.gms.internal.ads.zzava zzavaVar, android.view.View view, com.google.android.gms.internal.ads.zzfcn zzfcnVar) {
        android.content.Intent intent2 = new android.content.Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    public static final android.content.pm.ResolveInfo zzc(android.content.Intent intent, android.content.Context context, com.google.android.gms.internal.ads.zzava zzavaVar, android.view.View view, com.google.android.gms.internal.ads.zzfcn zzfcnVar) {
        return zzd(intent, new java.util.ArrayList(), context, zzavaVar, view, zzfcnVar);
    }

    public static final android.content.pm.ResolveInfo zzd(android.content.Intent intent, java.util.ArrayList arrayList, android.content.Context context, com.google.android.gms.internal.ads.zzava zzavaVar, android.view.View view, com.google.android.gms.internal.ads.zzfcn zzfcnVar) {
        android.content.pm.ResolveInfo resolveInfo = null;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            android.content.pm.ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                }
            }
            arrayList.addAll(listQueryIntentActivities);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        return resolveInfo;
    }
}
