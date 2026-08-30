package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgze {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    static java.lang.String zza(com.google.android.gms.internal.ads.zzgzc zzgzcVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzgzcVar, sb, 0);
        return sb.toString();
    }

    static void zzb(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i, sb);
        if (!str.isEmpty()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (java.lang.Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(java.lang.Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.ads.zzhaf.zza(com.google.android.gms.internal.ads.zzgwj.zzw((java.lang.String) obj)));
            sb.append(kotlin.text.Typography.quote);
            return;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgwj) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.ads.zzhaf.zza((com.google.android.gms.internal.ads.zzgwj) obj));
            sb.append(kotlin.text.Typography.quote);
            return;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgxr) {
            sb.append(" {");
            zzd((com.google.android.gms.internal.ads.zzgxr) obj, sb, i + 2);
            sb.append("\n");
            zzc(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        zzb(sb, i3, com.ironsource.y8.h.W, entry.getKey());
        zzb(sb, i3, "value", entry.getValue());
        sb.append("\n");
        zzc(i, sb);
        sb.append("}");
    }

    private static void zzc(int i, java.lang.StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0203  */
    private static void zzd(com.google.android.gms.internal.ads.zzgzc zzgzcVar, java.lang.StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = zzgzcVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i3];
            if (!java.lang.reflect.Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String strSubstring = ((java.lang.String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(java.util.List.class)) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 4), com.google.android.gms.internal.ads.zzgxr.zzbP(method2, zzgzcVar, new java.lang.Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 3), com.google.android.gms.internal.ads.zzgxr.zzbP(method, zzgzcVar, new java.lang.Object[0]));
            } else if (hashSet.contains("set".concat(java.lang.String.valueOf(strSubstring))) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(java.lang.String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has".concat(java.lang.String.valueOf(strSubstring)));
                if (method4 != null) {
                    java.lang.Object objZzbP = com.google.android.gms.internal.ads.zzgxr.zzbP(method4, zzgzcVar, new java.lang.Object[0]);
                    if (method5 == null) {
                        if (objZzbP instanceof java.lang.Boolean) {
                            if (((java.lang.Boolean) objZzbP).booleanValue()) {
                                zzb(sb, i, strSubstring, objZzbP);
                            }
                        } else if (objZzbP instanceof java.lang.Integer) {
                            if (((java.lang.Integer) objZzbP).intValue() != 0) {
                                zzb(sb, i, strSubstring, objZzbP);
                            }
                        } else if (objZzbP instanceof java.lang.Float) {
                            if (java.lang.Float.floatToRawIntBits(((java.lang.Float) objZzbP).floatValue()) != 0) {
                                zzb(sb, i, strSubstring, objZzbP);
                            }
                        } else if (!(objZzbP instanceof java.lang.Double)) {
                            if (objZzbP instanceof java.lang.String) {
                                zEquals = objZzbP.equals("");
                            } else if (objZzbP instanceof com.google.android.gms.internal.ads.zzgwj) {
                                zEquals = objZzbP.equals(com.google.android.gms.internal.ads.zzgwj.zzb);
                            } else if (objZzbP instanceof com.google.android.gms.internal.ads.zzgzc) {
                                if (objZzbP != ((com.google.android.gms.internal.ads.zzgzc) objZzbP).zzbt()) {
                                    zzb(sb, i, strSubstring, objZzbP);
                                }
                            } else if (!(objZzbP instanceof java.lang.Enum) || ((java.lang.Enum) objZzbP).ordinal() != 0) {
                                zzb(sb, i, strSubstring, objZzbP);
                            }
                            if (!zEquals) {
                                zzb(sb, i, strSubstring, objZzbP);
                            }
                        } else if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) objZzbP).doubleValue()) != 0) {
                            zzb(sb, i, strSubstring, objZzbP);
                        }
                    } else if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzgxr.zzbP(method5, zzgzcVar, new java.lang.Object[0])).booleanValue()) {
                        zzb(sb, i, strSubstring, objZzbP);
                    }
                }
            }
            i2 = 3;
        }
        if (zzgzcVar instanceof com.google.android.gms.internal.ads.zzgxn) {
            java.util.Iterator itZzf = ((com.google.android.gms.internal.ads.zzgxn) zzgzcVar).zza.zzf();
            while (itZzf.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) itZzf.next();
                zzb(sb, i, com.ironsource.y8.i.d + ((com.google.android.gms.internal.ads.zzgxo) entry2.getKey()).zza + com.ironsource.y8.i.e, entry2.getValue());
            }
        }
        com.google.android.gms.internal.ads.zzhai zzhaiVar = ((com.google.android.gms.internal.ads.zzgxr) zzgzcVar).zzt;
        if (zzhaiVar != null) {
            zzhaiVar.zzi(sb, i);
        }
    }
}
