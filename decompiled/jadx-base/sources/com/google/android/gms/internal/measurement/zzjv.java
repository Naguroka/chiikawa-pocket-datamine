package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjv {
    private static volatile com.google.common.base.Optional zza;

    private zzjv() {
    }

    public static com.google.common.base.Optional zza(android.content.Context context) {
        com.google.common.base.Optional optionalAbsent;
        com.google.common.base.Optional optionalAbsent2;
        com.google.common.base.Optional optional = zza;
        if (optional == null) {
            synchronized (com.google.android.gms.internal.measurement.zzjv.class) {
                optional = zza;
                if (optional == null) {
                    java.lang.String str = android.os.Build.TYPE;
                    java.lang.String str2 = android.os.Build.TAGS;
                    int i = com.google.android.gms.internal.measurement.zzjx.zza;
                    if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                        if (com.google.android.gms.internal.measurement.zzji.zzc() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                        try {
                            android.os.StrictMode.allowThreadDiskWrites();
                            try {
                                java.io.File file = new java.io.File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                optionalAbsent = file.exists() ? com.google.common.base.Optional.of(file) : com.google.common.base.Optional.absent();
                            } catch (java.lang.RuntimeException e) {
                                android.util.Log.e("HermeticFileOverrides", "no data dir", e);
                                optionalAbsent = com.google.common.base.Optional.absent();
                            }
                            if (optionalAbsent.isPresent()) {
                                java.io.File file2 = (java.io.File) optionalAbsent.get();
                                try {
                                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file2)));
                                    try {
                                        androidx.collection.SimpleArrayMap simpleArrayMap = new androidx.collection.SimpleArrayMap();
                                        java.util.HashMap map = new java.util.HashMap();
                                        while (true) {
                                            java.lang.String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            java.lang.String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                android.util.Log.e("HermeticFileOverrides", "Invalid: " + line);
                                            } else {
                                                java.lang.String str3 = new java.lang.String(strArrSplit[0]);
                                                java.lang.String strDecode = android.net.Uri.decode(new java.lang.String(strArrSplit[1]));
                                                java.lang.String strDecode2 = (java.lang.String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    java.lang.String str4 = new java.lang.String(strArrSplit[2]);
                                                    strDecode2 = android.net.Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                androidx.collection.SimpleArrayMap simpleArrayMap2 = (androidx.collection.SimpleArrayMap) simpleArrayMap.get(str3);
                                                if (simpleArrayMap2 == null) {
                                                    simpleArrayMap2 = new androidx.collection.SimpleArrayMap();
                                                    simpleArrayMap.put(str3, simpleArrayMap2);
                                                }
                                                simpleArrayMap2.put(strDecode, strDecode2);
                                            }
                                        }
                                        android.util.Log.w("HermeticFileOverrides", "Parsed " + file2.toString() + " for Android package " + context.getPackageName());
                                        com.google.android.gms.internal.measurement.zzjo zzjoVar = new com.google.android.gms.internal.measurement.zzjo(simpleArrayMap);
                                        bufferedReader.close();
                                        optionalAbsent2 = com.google.common.base.Optional.of(zzjoVar);
                                    } catch (java.lang.Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (java.lang.Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (java.io.IOException e2) {
                                    throw new java.lang.RuntimeException(e2);
                                }
                            } else {
                                optionalAbsent2 = com.google.common.base.Optional.absent();
                            }
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (java.lang.Throwable th3) {
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        optionalAbsent2 = com.google.common.base.Optional.absent();
                    }
                    zza = optionalAbsent2;
                    optional = optionalAbsent2;
                }
            }
        }
        return optional;
    }
}
