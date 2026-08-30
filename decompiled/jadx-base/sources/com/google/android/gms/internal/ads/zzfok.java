package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfok {
    public static boolean zza(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0130  */
    /* JADX WARN: Code duplicated, block: B:85:0x0133  */
    /* JADX WARN: Code duplicated, block: B:86:0x0136  */
    /* JADX WARN: Code duplicated, block: B:87:0x0139  */
    /* JADX WARN: Code duplicated, block: B:88:0x013c  */
    public static final int zzb(android.content.Context context, com.google.android.gms.internal.ads.zzfni zzfniVar) {
        int i;
        java.lang.String str;
        java.lang.String strZzc;
        java.io.File file = new java.io.File(new java.io.File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            java.io.File[] fileArrListFiles = file.listFiles(new com.google.android.gms.internal.ads.zzgae(java.util.regex.Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                zzfniVar.zzb(5017, "No .so");
            } else {
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                zzd(bArr, null, context, zzfniVar);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s = java.nio.ByteBuffer.wrap(bArr2).getShort();
                                if (s == 3) {
                                    fileInputStream.close();
                                    i = 5;
                                } else if (s == 40) {
                                    fileInputStream.close();
                                    i = 3;
                                } else if (s == 62) {
                                    fileInputStream.close();
                                    i = 7;
                                } else if (s == 183) {
                                    fileInputStream.close();
                                    i = 6;
                                } else if (s != 243) {
                                    zzd(bArr, null, context, zzfniVar);
                                } else {
                                    fileInputStream.close();
                                    i = 8;
                                }
                            }
                        }
                        fileInputStream.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    zzd(null, e.toString(), context, zzfniVar);
                }
                i = 1;
            }
            if (i == 1000) {
                strZzc = zzc(context, zzfniVar);
                if (android.text.TextUtils.isEmpty(strZzc)) {
                    zzd(null, "Empty dev arch", context, zzfniVar);
                } else if (!strZzc.equalsIgnoreCase("i686") || strZzc.equalsIgnoreCase("x86")) {
                    i = 5;
                } else if (strZzc.equalsIgnoreCase("x86_64")) {
                    i = 7;
                } else if (strZzc.equalsIgnoreCase("arm64-v8a")) {
                    i = 6;
                } else if (strZzc.equalsIgnoreCase("armeabi-v7a") || strZzc.equalsIgnoreCase("armv71")) {
                    i = 3;
                } else if (strZzc.equalsIgnoreCase("riscv64")) {
                    i = 8;
                } else {
                    zzd(null, strZzc, context, zzfniVar);
                }
                i = 1;
            }
            if (i != 1) {
                str = "UNSUPPORTED";
            } else if (i != 3) {
                str = "ARM7";
            } else if (i != 5) {
                str = "X86";
            } else if (i != 6) {
                str = "ARM64";
            } else if (i != 7) {
                str = "X86_64";
            } else if (i != 8) {
                str = "null";
            } else {
                str = "RISCV64";
            }
            zzfniVar.zzb(5018, str);
            return i;
        }
        zzfniVar.zzb(5017, "No lib/");
        i = 1000;
        if (i == 1000) {
            strZzc = zzc(context, zzfniVar);
            if (android.text.TextUtils.isEmpty(strZzc)) {
                zzd(null, "Empty dev arch", context, zzfniVar);
            } else if (strZzc.equalsIgnoreCase("i686")) {
                i = 5;
            } else {
                i = 5;
            }
            i = 1;
        }
        if (i != 1) {
            str = "UNSUPPORTED";
        } else if (i != 3) {
            str = "ARM7";
        } else if (i != 5) {
            str = "X86";
        } else if (i != 6) {
            str = "ARM64";
        } else if (i != 7) {
            str = "X86_64";
        } else if (i != 8) {
            str = "null";
        } else {
            str = "RISCV64";
        }
        zzfniVar.zzb(5018, str);
        return i;
    }

    private static final java.lang.String zzc(android.content.Context context, com.google.android.gms.internal.ads.zzfni zzfniVar) {
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList("i686", "armv71"));
        java.lang.String strZza = com.google.android.gms.internal.ads.zzfvd.OS_ARCH.zza();
        if (!android.text.TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            java.lang.String[] strArr = (java.lang.String[]) android.os.Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (java.lang.IllegalAccessException e) {
            zzfniVar.zzc(2024, 0L, e);
        } catch (java.lang.NoSuchFieldException e2) {
            zzfniVar.zzc(2024, 0L, e2);
        }
        return android.os.Build.CPU_ABI != null ? android.os.Build.CPU_ABI : android.os.Build.CPU_ABI2;
    }

    private static final void zzd(byte[] bArr, java.lang.String str, android.content.Context context, com.google.android.gms.internal.ads.zzfni zzfniVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("os.arch:");
        sb.append(com.google.android.gms.internal.ads.zzfvd.OS_ARCH.zza());
        sb.append(";");
        try {
            java.lang.String[] strArr = (java.lang.String[]) android.os.Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(java.util.Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(android.os.Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(android.os.Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(java.util.Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfniVar.zzb(com.json.mediationsdk.utils.IronSourceConstants.NT_INSTANCE_UNEXPECTED_LOAD_SUCCESS, sb.toString());
    }
}
