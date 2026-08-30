package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbs {
    public static android.os.Bundle zza(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        android.os.Bundle bundle = new android.os.Bundle();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof java.lang.Boolean) {
                    bundle.putBoolean(next, ((java.lang.Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof java.lang.Double) {
                    bundle.putDouble(next, ((java.lang.Double) objOpt).doubleValue());
                } else if (objOpt instanceof java.lang.Integer) {
                    bundle.putInt(next, ((java.lang.Integer) objOpt).intValue());
                } else if (objOpt instanceof java.lang.Long) {
                    bundle.putLong(next, ((java.lang.Long) objOpt).longValue());
                } else if (objOpt instanceof java.lang.String) {
                    bundle.putString(next, (java.lang.String) objOpt);
                } else if (objOpt instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArray = (org.json.JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        java.lang.Object objOpt2 = null;
                        for (int i2 = 0; objOpt2 == null && i2 < length; i2++) {
                            objOpt2 = !jSONArray.isNull(i2) ? jSONArray.opt(i2) : null;
                        }
                        if (objOpt2 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Expected JSONArray with at least 1 non-null element for key:".concat(java.lang.String.valueOf(next)));
                        } else if (objOpt2 instanceof org.json.JSONObject) {
                            android.os.Bundle[] bundleArr = new android.os.Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? zza(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof java.lang.Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof java.lang.CharSequence) {
                            java.lang.String[] strArr = new java.lang.String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof java.lang.Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj(java.lang.String.format("JSONArray with unsupported type %s for key:%s", objOpt2.getClass().getCanonicalName(), next));
                        }
                    }
                } else if (objOpt instanceof org.json.JSONObject) {
                    bundle.putBundle(next, zza((org.json.JSONObject) objOpt));
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unsupported type for key:".concat(java.lang.String.valueOf(next)));
                }
            }
        }
        return bundle;
    }

    public static java.lang.String zzb(java.lang.String str, org.json.JSONObject jSONObject, java.lang.String... strArr) {
        org.json.JSONObject jSONObjectZzn = zzn(jSONObject, strArr);
        return jSONObjectZzn == null ? "" : jSONObjectZzn.optString(strArr[0], "");
    }

    public static java.util.List zzc(org.json.JSONArray jSONArray, java.util.List list) throws org.json.JSONException {
        if (list == null) {
            list = new java.util.ArrayList();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                list.add(jSONArray.getString(i));
            }
        }
        return list;
    }

    public static java.util.List zzd(android.util.JsonReader jsonReader) throws java.lang.IllegalStateException, java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static java.util.Map zze(android.util.JsonReader jsonReader) throws java.lang.IllegalStateException, java.io.IOException {
        java.util.HashMap map = new java.util.HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            java.util.HashMap map2 = new java.util.HashMap();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                map2.put(jsonReader.nextName(), jsonReader.nextString());
            }
            jsonReader.endObject();
            map.put(strNextName, map2);
        }
        jsonReader.endObject();
        return map;
    }

    public static org.json.JSONArray zzf(android.util.JsonReader jsonReader) throws java.lang.IllegalStateException, org.json.JSONException, java.io.IOException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            android.util.JsonToken jsonTokenPeek = jsonReader.peek();
            if (android.util.JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONArray.put(zzf(jsonReader));
            } else if (android.util.JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONArray.put(zzi(jsonReader));
            } else if (android.util.JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (android.util.JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!android.util.JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new java.lang.IllegalStateException("unexpected json token: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(jsonTokenPeek))));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static org.json.JSONObject zzg(org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (org.json.JSONException unused) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static org.json.JSONObject zzh(org.json.JSONObject jSONObject, java.lang.String... strArr) {
        org.json.JSONObject jSONObjectZzn = zzn(jSONObject, strArr);
        if (jSONObjectZzn == null) {
            return null;
        }
        return jSONObjectZzn.optJSONObject(strArr[1]);
    }

    public static org.json.JSONObject zzi(android.util.JsonReader jsonReader) throws java.lang.IllegalStateException, org.json.JSONException, java.io.IOException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            android.util.JsonToken jsonTokenPeek = jsonReader.peek();
            if (android.util.JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, zzf(jsonReader));
            } else if (android.util.JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, zzi(jsonReader));
            } else if (android.util.JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (android.util.JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!android.util.JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new java.lang.IllegalStateException("unexpected json token: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(jsonTokenPeek))));
                }
                jSONObject.put(strNextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void zzj(android.util.JsonWriter jsonWriter, org.json.JSONArray jSONArray) throws java.io.IOException {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                java.lang.Object obj = jSONArray.get(i);
                if (obj instanceof java.lang.String) {
                    jsonWriter.value((java.lang.String) obj);
                } else if (obj instanceof java.lang.Number) {
                    jsonWriter.value((java.lang.Number) obj);
                } else if (obj instanceof java.lang.Boolean) {
                    jsonWriter.value(((java.lang.Boolean) obj).booleanValue());
                } else if (obj instanceof org.json.JSONObject) {
                    zzk(jsonWriter, (org.json.JSONObject) obj);
                } else {
                    if (!(obj instanceof org.json.JSONArray)) {
                        throw new org.json.JSONException("unable to write field: " + java.lang.String.valueOf(obj));
                    }
                    zzj(jsonWriter, (org.json.JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (org.json.JSONException e) {
            throw new java.io.IOException(e);
        }
    }

    public static void zzk(android.util.JsonWriter jsonWriter, org.json.JSONObject jSONObject) throws java.io.IOException {
        try {
            jsonWriter.beginObject();
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.Object obj = jSONObject.get(next);
                if (obj instanceof java.lang.String) {
                    jsonWriter.name(next).value((java.lang.String) obj);
                } else if (obj instanceof java.lang.Number) {
                    jsonWriter.name(next).value((java.lang.Number) obj);
                } else if (obj instanceof java.lang.Boolean) {
                    jsonWriter.name(next).value(((java.lang.Boolean) obj).booleanValue());
                } else if (obj instanceof org.json.JSONObject) {
                    zzk(jsonWriter.name(next), (org.json.JSONObject) obj);
                } else {
                    if (!(obj instanceof org.json.JSONArray)) {
                        throw new org.json.JSONException("unable to write field: " + java.lang.String.valueOf(obj));
                    }
                    zzj(jsonWriter.name(next), (org.json.JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (org.json.JSONException e) {
            throw new java.io.IOException(e);
        }
    }

    public static boolean zzl(boolean z, org.json.JSONObject jSONObject, java.lang.String... strArr) {
        org.json.JSONObject jSONObjectZzn = zzn(jSONObject, strArr);
        if (jSONObjectZzn == null) {
            return false;
        }
        return jSONObjectZzn.optBoolean(strArr[strArr.length - 1], false);
    }

    public static java.lang.String zzm(com.google.android.gms.internal.ads.zzfbt zzfbtVar) {
        if (zzfbtVar == null) {
            return null;
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            android.util.JsonWriter jsonWriter = new android.util.JsonWriter(stringWriter);
            zzo(jsonWriter, zzfbtVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error when writing JSON.", e);
            return null;
        }
    }

    private static org.json.JSONObject zzn(org.json.JSONObject jSONObject, java.lang.String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    private static void zzo(android.util.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof java.lang.Number) {
            jsonWriter.value((java.lang.Number) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            jsonWriter.value(((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            jsonWriter.value((java.lang.String) obj);
            return;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzfbt) {
            zzk(jsonWriter, ((com.google.android.gms.internal.ads.zzfbt) obj).zzd);
            return;
        }
        if (!(obj instanceof java.util.Map)) {
            if (!(obj instanceof java.util.List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                zzo(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
            java.lang.Object key = entry.getKey();
            if (key instanceof java.lang.String) {
                zzo(jsonWriter.name((java.lang.String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }
}
