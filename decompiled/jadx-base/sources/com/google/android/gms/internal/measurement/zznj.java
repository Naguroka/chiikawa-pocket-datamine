package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zznj {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    static java.lang.String zza(com.google.android.gms.internal.measurement.zznh zznhVar, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zznhVar, sb, 0);
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
            com.google.android.gms.internal.measurement.zzld zzldVar = com.google.android.gms.internal.measurement.zzld.zzb;
            sb.append(com.google.android.gms.internal.measurement.zzoc.zza(new com.google.android.gms.internal.measurement.zzlb(((java.lang.String) obj).getBytes(com.google.android.gms.internal.measurement.zzmk.zza))));
            sb.append(kotlin.text.Typography.quote);
            return;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzld) {
            sb.append(": \"");
            sb.append(com.google.android.gms.internal.measurement.zzoc.zza((com.google.android.gms.internal.measurement.zzld) obj));
            sb.append(kotlin.text.Typography.quote);
            return;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzmd) {
            sb.append(" {");
            zzd((com.google.android.gms.internal.measurement.zzmd) obj, sb, i + 2);
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
    private static void zzd(com.google.android.gms.internal.measurement.zznh zznhVar, java.lang.StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = zznhVar.getClass().getDeclaredMethods();
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
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 4), com.google.android.gms.internal.measurement.zzmd.zzcp(method2, zznhVar, new java.lang.Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 3), com.google.android.gms.internal.measurement.zzmd.zzcp(method, zznhVar, new java.lang.Object[0]));
            } else if (hashSet.contains("set".concat(java.lang.String.valueOf(strSubstring))) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(java.lang.String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has".concat(java.lang.String.valueOf(strSubstring)));
                if (method4 != null) {
                    java.lang.Object objZzcp = com.google.android.gms.internal.measurement.zzmd.zzcp(method4, zznhVar, new java.lang.Object[0]);
                    if (method5 == null) {
                        if (objZzcp instanceof java.lang.Boolean) {
                            if (((java.lang.Boolean) objZzcp).booleanValue()) {
                                zzb(sb, i, strSubstring, objZzcp);
                            }
                        } else if (objZzcp instanceof java.lang.Integer) {
                            if (((java.lang.Integer) objZzcp).intValue() != 0) {
                                zzb(sb, i, strSubstring, objZzcp);
                            }
                        } else if (objZzcp instanceof java.lang.Float) {
                            if (java.lang.Float.floatToRawIntBits(((java.lang.Float) objZzcp).floatValue()) != 0) {
                                zzb(sb, i, strSubstring, objZzcp);
                            }
                        } else if (!(objZzcp instanceof java.lang.Double)) {
                            if (objZzcp instanceof java.lang.String) {
                                zEquals = objZzcp.equals("");
                            } else if (objZzcp instanceof com.google.android.gms.internal.measurement.zzld) {
                                zEquals = objZzcp.equals(com.google.android.gms.internal.measurement.zzld.zzb);
                            } else if (objZzcp instanceof com.google.android.gms.internal.measurement.zznh) {
                                if (objZzcp != ((com.google.android.gms.internal.measurement.zznh) objZzcp).zzcC()) {
                                    zzb(sb, i, strSubstring, objZzcp);
                                }
                            } else if (!(objZzcp instanceof java.lang.Enum) || ((java.lang.Enum) objZzcp).ordinal() != 0) {
                                zzb(sb, i, strSubstring, objZzcp);
                            }
                            if (!zEquals) {
                                zzb(sb, i, strSubstring, objZzcp);
                            }
                        } else if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) objZzcp).doubleValue()) != 0) {
                            zzb(sb, i, strSubstring, objZzcp);
                        }
                    } else if (((java.lang.Boolean) com.google.android.gms.internal.measurement.zzmd.zzcp(method5, zznhVar, new java.lang.Object[0])).booleanValue()) {
                        zzb(sb, i, strSubstring, objZzcp);
                    }
                }
            }
            i2 = 3;
        }
        if (zznhVar instanceof com.google.android.gms.internal.measurement.zzma) {
            java.util.Iterator itZze = ((com.google.android.gms.internal.measurement.zzma) zznhVar).zzb.zze();
            if (itZze.hasNext()) {
                throw null;
            }
        }
        com.google.android.gms.internal.measurement.zzof zzofVar = ((com.google.android.gms.internal.measurement.zzmd) zznhVar).zzc;
        if (zzofVar != null) {
            zzofVar.zzi(sb, i);
        }
    }
}
