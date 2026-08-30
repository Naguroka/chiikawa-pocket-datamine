package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final java.lang.String[] zzc = {"", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0064  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v21 int, still in use, count: 1, list:
  (r3v21 int) from 0x006d: IF  (r3v21 int) != (1567 int)  -> B:18:0x006f A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v21 int, still in use, count: 1, list:
  (r3v21 int) from 0x006d: IF  (r3v21 int) != (1567 int)  -> B:18:0x006f A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzab zzabVar) {
        int i;
        int i2;
        int i3;
        android.util.Pair pair;
        int i4;
        int i5;
        int i6;
        int i7;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.String str = zzabVar.zzk;
        if (str != null) {
            java.lang.String[] strArrSplit = str.split("\\.");
            int i8 = 3;
            int i9 = 2;
            if (!androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(zzabVar.zzo)) {
                switch (strArrSplit[0]) {
                    case "s263":
                        java.lang.String str2 = zzabVar.zzk;
                        android.util.Pair pair2 = new android.util.Pair(1, 1);
                        if (strArrSplit.length < 3) {
                            com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(java.lang.String.valueOf(str2)));
                        } else {
                            try {
                                return new android.util.Pair(java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[1])), java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[2])));
                            } catch (java.lang.NumberFormatException unused) {
                                com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(java.lang.String.valueOf(str2)));
                            }
                        }
                        return pair2;
                    case "avc1":
                    case "avc2":
                        java.lang.String str3 = zzabVar.zzk;
                        int length = strArrSplit.length;
                        if (length < 2) {
                            com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(str3)));
                            break;
                        } else {
                            try {
                                if (strArrSplit[1].length() == 6) {
                                    i = java.lang.Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                                    i2 = java.lang.Integer.parseInt(strArrSplit[1].substring(4), 16);
                                } else if (length < 3) {
                                    com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str3);
                                } else {
                                    i = java.lang.Integer.parseInt(strArrSplit[1]);
                                    i2 = java.lang.Integer.parseInt(strArrSplit[2]);
                                }
                                if (i == 66) {
                                    i9 = 1;
                                } else if (i != 77) {
                                    if (i == 88) {
                                        i9 = 4;
                                    } else if (i == 100) {
                                        i9 = 8;
                                    } else if (i == 110) {
                                        i9 = 16;
                                    } else if (i != 122) {
                                        i9 = i != 244 ? -1 : 64;
                                    } else {
                                        i9 = 32;
                                    }
                                }
                                if (i9 == -1) {
                                    com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Unknown AVC profile: " + i);
                                } else {
                                    switch (i2) {
                                        case 10:
                                            i3 = 1;
                                            break;
                                        case 11:
                                            i3 = 4;
                                            break;
                                        case 12:
                                            i3 = 8;
                                            break;
                                        case 13:
                                            i3 = 16;
                                            break;
                                        default:
                                            switch (i2) {
                                                case 20:
                                                    i3 = 32;
                                                    break;
                                                case 21:
                                                    i3 = 64;
                                                    break;
                                                case 22:
                                                    i3 = 128;
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 30:
                                                            i3 = 256;
                                                            break;
                                                        case 31:
                                                            i3 = 512;
                                                            break;
                                                        case 32:
                                                            i3 = 1024;
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case 40:
                                                                    i3 = 2048;
                                                                    break;
                                                                case 41:
                                                                    i3 = 4096;
                                                                    break;
                                                                case 42:
                                                                    i3 = 8192;
                                                                    break;
                                                                default:
                                                                    switch (i2) {
                                                                        case 50:
                                                                            i3 = 16384;
                                                                            break;
                                                                        case 51:
                                                                            i3 = 32768;
                                                                            break;
                                                                        case 52:
                                                                            i3 = 65536;
                                                                            break;
                                                                        default:
                                                                            i3 = -1;
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    if (i3 != -1) {
                                        pair = new android.util.Pair(java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i3));
                                        return pair;
                                    }
                                    com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Unknown AVC level: " + i2);
                                }
                            } catch (java.lang.NumberFormatException unused2) {
                                com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(java.lang.String.valueOf(str3)));
                            }
                            break;
                        }
                        break;
                    case "vp09":
                        java.lang.String str4 = zzabVar.zzk;
                        if (strArrSplit.length < 3) {
                            com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(java.lang.String.valueOf(str4)));
                            break;
                        } else {
                            try {
                                int i10 = java.lang.Integer.parseInt(strArrSplit[1]);
                                int i11 = java.lang.Integer.parseInt(strArrSplit[2]);
                                if (i10 == 0) {
                                    i4 = 1;
                                } else if (i10 == 1) {
                                    i4 = 2;
                                } else if (i10 != 2) {
                                    i4 = i10 != 3 ? -1 : 8;
                                } else {
                                    i4 = 4;
                                }
                                if (i4 == -1) {
                                    com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Unknown VP9 profile: " + i10);
                                } else {
                                    if (i11 == 10) {
                                        i9 = 1;
                                    } else if (i11 != 11) {
                                        if (i11 == 20) {
                                            i9 = 4;
                                        } else if (i11 == 21) {
                                            i9 = 8;
                                        } else if (i11 == 30) {
                                            i9 = 16;
                                        } else if (i11 == 31) {
                                            i9 = 32;
                                        } else if (i11 == 40) {
                                            i9 = 64;
                                        } else if (i11 == 41) {
                                            i9 = 128;
                                        } else if (i11 == 50) {
                                            i9 = 256;
                                        } else if (i11 != 51) {
                                            switch (i11) {
                                                case 60:
                                                    i9 = 2048;
                                                    break;
                                                case 61:
                                                    i9 = 4096;
                                                    break;
                                                case 62:
                                                    i9 = 8192;
                                                    break;
                                                default:
                                                    i9 = -1;
                                                    break;
                                            }
                                        } else {
                                            i9 = 512;
                                        }
                                    }
                                    if (i9 != -1) {
                                        pair = new android.util.Pair(java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i9));
                                        return pair;
                                    }
                                    com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Unknown VP9 level: " + i11);
                                }
                            } catch (java.lang.NumberFormatException unused3) {
                                com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(java.lang.String.valueOf(str4)));
                            }
                            break;
                        }
                        break;
                    case "hev1":
                    case "hvc1":
                        return zzb(zzabVar.zzk, strArrSplit, zzabVar.zzC);
                    case "av01":
                        java.lang.String str5 = zzabVar.zzk;
                        com.google.android.gms.internal.ads.zzk zzkVar = zzabVar.zzC;
                        if (strArrSplit.length < 4) {
                            com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(java.lang.String.valueOf(str5)));
                            break;
                        } else {
                            try {
                                int i12 = java.lang.Integer.parseInt(strArrSplit[1]);
                                int i13 = java.lang.Integer.parseInt(strArrSplit[2].substring(0, 2));
                                int i14 = java.lang.Integer.parseInt(strArrSplit[3]);
                                if (i12 != 0) {
                                    com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Unknown AV1 profile: " + i12);
                                } else {
                                    if (i14 == 8) {
                                        i5 = 1;
                                    } else if (i14 != 10) {
                                        com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + i14);
                                    } else {
                                        i5 = (zzkVar == null || !(zzkVar.zze != null || (i7 = zzkVar.zzd) == 7 || i7 == 6)) ? 2 : 4096;
                                    }
                                    switch (i13) {
                                        case 0:
                                            i6 = 1;
                                            break;
                                        case 1:
                                            i6 = 2;
                                            break;
                                        case 2:
                                            i6 = 4;
                                            break;
                                        case 3:
                                            i6 = 8;
                                            break;
                                        case 4:
                                            i6 = 16;
                                            break;
                                        case 5:
                                            i6 = 32;
                                            break;
                                        case 6:
                                            i6 = 64;
                                            break;
                                        case 7:
                                            i6 = 128;
                                            break;
                                        case 8:
                                            i6 = 256;
                                            break;
                                        case 9:
                                            i6 = 512;
                                            break;
                                        case 10:
                                            i6 = 1024;
                                            break;
                                        case 11:
                                            i6 = 2048;
                                            break;
                                        case 12:
                                            i6 = 4096;
                                            break;
                                        case 13:
                                            i6 = 8192;
                                            break;
                                        case 14:
                                            i6 = 16384;
                                            break;
                                        case 15:
                                            i6 = 32768;
                                            break;
                                        case 16:
                                            i6 = 65536;
                                            break;
                                        case 17:
                                            i6 = 131072;
                                            break;
                                        case 18:
                                            i6 = 262144;
                                            break;
                                        case 19:
                                            i6 = 524288;
                                            break;
                                        case 20:
                                            i6 = 1048576;
                                            break;
                                        case 21:
                                            i6 = 2097152;
                                            break;
                                        case 22:
                                            i6 = 4194304;
                                            break;
                                        case 23:
                                            i6 = 8388608;
                                            break;
                                        default:
                                            i6 = -1;
                                            break;
                                    }
                                    if (i6 != -1) {
                                        return new android.util.Pair(java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i6));
                                    }
                                    com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Unknown AV1 level: " + i13);
                                }
                            } catch (java.lang.NumberFormatException unused4) {
                                com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(java.lang.String.valueOf(str5)));
                            }
                            break;
                        }
                        break;
                    case "mp4a":
                        java.lang.String str6 = zzabVar.zzk;
                        if (strArrSplit.length != 3) {
                            com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(java.lang.String.valueOf(str6)));
                            break;
                        } else {
                            try {
                                if (androidx.media3.common.MimeTypes.AUDIO_AAC.equals(com.google.android.gms.internal.ads.zzbb.zzd(java.lang.Integer.parseInt(strArrSplit[1], 16)))) {
                                    int i15 = java.lang.Integer.parseInt(strArrSplit[2]);
                                    if (i15 == 17) {
                                        i8 = 17;
                                    } else if (i15 == 20) {
                                        i8 = 20;
                                    } else if (i15 == 23) {
                                        i8 = 23;
                                    } else if (i15 == 29) {
                                        i8 = 29;
                                    } else if (i15 == 39) {
                                        i8 = 39;
                                    } else if (i15 != 42) {
                                        switch (i15) {
                                            case 1:
                                                i8 = 1;
                                                break;
                                            case 2:
                                                i8 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i8 = 4;
                                                break;
                                            case 5:
                                                i8 = 5;
                                                break;
                                            case 6:
                                                i8 = 6;
                                                break;
                                            default:
                                                i8 = -1;
                                                break;
                                        }
                                    } else {
                                        i8 = 42;
                                    }
                                    if (i8 != -1) {
                                        return new android.util.Pair(java.lang.Integer.valueOf(i8), 0);
                                    }
                                }
                            } catch (java.lang.NumberFormatException unused5) {
                                com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(java.lang.String.valueOf(str6)));
                            }
                            break;
                        }
                        break;
                }
            } else {
                java.lang.String str7 = zzabVar.zzk;
                if (strArrSplit.length < 3) {
                    com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(java.lang.String.valueOf(str7)));
                } else {
                    java.util.regex.Matcher matcher = zzd.matcher(strArrSplit[1]);
                    if (matcher.matches()) {
                        java.lang.String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            if (strGroup.hashCode() != 1567) {
                                switch (strGroup) {
                                    case "00":
                                        num = 1;
                                        break;
                                    case "01":
                                        num = 2;
                                        break;
                                    case "02":
                                        num = 4;
                                        break;
                                    case "03":
                                        num = 8;
                                        break;
                                    case "04":
                                        num = 16;
                                        break;
                                    case "05":
                                        num = 32;
                                        break;
                                    case "06":
                                        num = 64;
                                        break;
                                    case "07":
                                        num = 128;
                                        break;
                                    case "08":
                                        num = 256;
                                        break;
                                    case "09":
                                        num = 512;
                                        break;
                                    default:
                                        num = null;
                                        break;
                                }
                            } else if (strGroup.equals("10")) {
                                num = 1024;
                            } else {
                                num = null;
                            }
                        } else {
                            num = null;
                        }
                        if (num == null) {
                            com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(java.lang.String.valueOf(strGroup)));
                        } else {
                            java.lang.String str8 = strArrSplit[2];
                            if (str8 != null) {
                                str8.hashCode();
                                switch (str8) {
                                    case "01":
                                        num2 = 1;
                                        break;
                                    case "02":
                                        num2 = 2;
                                        break;
                                    case "03":
                                        num2 = 4;
                                        break;
                                    case "04":
                                        num2 = 8;
                                        break;
                                    case "05":
                                        num2 = 16;
                                        break;
                                    case "06":
                                        num2 = 32;
                                        break;
                                    case "07":
                                        num2 = 64;
                                        break;
                                    case "08":
                                        num2 = 128;
                                        break;
                                    case "09":
                                        num2 = 256;
                                        break;
                                    default:
                                        switch (str8) {
                                            case 1567:
                                                if (!str8.equals("10")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 512;
                                                }
                                                break;
                                            case 1568:
                                                if (!str8.equals("11")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 1024;
                                                }
                                                break;
                                            case 1569:
                                                if (!str8.equals("12")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 2048;
                                                }
                                                break;
                                            case 1570:
                                                if (!str8.equals("13")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 4096;
                                                }
                                                break;
                                            default:
                                                num2 = null;
                                                break;
                                        }
                                }
                            } else {
                                num2 = null;
                            }
                            if (num2 != null) {
                                return new android.util.Pair(num, num2);
                            }
                            com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(java.lang.String.valueOf(str8)));
                        }
                    } else {
                        com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(java.lang.String.valueOf(str7)));
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0196  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    public static android.util.Pair zzb(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.internal.ads.zzk zzkVar) {
        int i;
        java.lang.Integer num;
        if (strArr.length < 4) {
            com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        java.util.regex.Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(java.lang.String.valueOf(str)));
            return null;
        }
        java.lang.String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i = 1;
        } else if ("2".equals(strGroup)) {
            i = (zzkVar == null || zzkVar.zzd != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(java.lang.String.valueOf(strGroup)));
                return null;
            }
            i = 6;
        }
        java.lang.String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "L30":
                    num = 1;
                    break;
                case "L60":
                    num = 4;
                    break;
                case "L63":
                    num = 16;
                    break;
                case "L90":
                    num = 64;
                    break;
                case "L93":
                    num = 256;
                    break;
                case "L120":
                    num = 1024;
                    break;
                case "L123":
                    num = 4096;
                    break;
                case "L150":
                    num = 16384;
                    break;
                case "L153":
                    num = 65536;
                    break;
                case "L156":
                    num = 262144;
                    break;
                case "L180":
                    num = 1048576;
                    break;
                case "L183":
                    num = 4194304;
                    break;
                case "L186":
                    num = 16777216;
                    break;
                case "H30":
                    num = 2;
                    break;
                case "H60":
                    num = 8;
                    break;
                case "H63":
                    num = 32;
                    break;
                case "H90":
                    num = 128;
                    break;
                case "H93":
                    num = 512;
                    break;
                case "H120":
                    num = 2048;
                    break;
                case "H123":
                    num = 8192;
                    break;
                case "H150":
                    num = 32768;
                    break;
                case "H153":
                    num = 131072;
                    break;
                case "H156":
                    num = 524288;
                    break;
                case "H180":
                    num = 2097152;
                    break;
                case "H183":
                    num = 8388608;
                    break;
                case "H186":
                    num = 33554432;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new android.util.Pair(java.lang.Integer.valueOf(i), num);
        }
        com.google.android.gms.internal.ads.zzdo.zzf("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(java.lang.String.valueOf(str2)));
        return null;
    }

    public static java.lang.String zzc(int i, int i2, int i3) {
        return java.lang.String.format("avc1.%02X%02X%02X", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
    }

    public static java.lang.String zzd(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = zzc[i];
        objArr[1] = java.lang.Integer.valueOf(i2);
        objArr[2] = java.lang.Integer.valueOf(i3);
        objArr[3] = java.lang.Character.valueOf(true != z ? 'L' : 'H');
        objArr[4] = java.lang.Integer.valueOf(i4);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.format(java.util.Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(java.lang.String.format(".%02X", java.lang.Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    public static byte[] zze(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        java.lang.System.arraycopy(zzb, 0, bArr2, 0, 4);
        java.lang.System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
