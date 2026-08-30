package com.applovin.impl.sdk.utils;

/* JADX INFO: loaded from: classes3.dex */
public class CollectionUtils {
    public static <T> boolean addObjectIfExists(T t, java.util.List<T> list) {
        if (t != null) {
            return list.add(t);
        }
        return false;
    }

    public static <T> boolean addUniqueObjectIfExists(T t, java.util.List<T> list) {
        if (t == null || list.contains(t)) {
            return false;
        }
        return list.add(t);
    }

    public static <T> void addUniqueObjectsIfExists(java.util.List<T> list, java.util.List<T> list2) {
        if (list == null) {
            return;
        }
        for (T t : list) {
            if (!list2.contains(t)) {
                list2.add(t);
            }
        }
    }

    public static java.util.List<java.lang.String> explode(java.lang.String str) {
        return explode(str, ",\\s*");
    }

    public static boolean getBoolean(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) {
        return getBoolean(map, str, false);
    }

    public static <T> java.util.Set<T> getDifferenceSet(java.util.Set<T> set, java.util.Set<T> set2) {
        if (set == null) {
            return null;
        }
        if (set2 == null) {
            return new java.util.HashSet(set);
        }
        java.util.HashSet hashSet = new java.util.HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    public static java.util.HashMap<java.lang.String, java.lang.String> hashMap(java.lang.String str, java.lang.String str2) {
        return (java.util.HashMap) map(str, str2);
    }

    public static java.lang.String implode(java.util.Collection<java.lang.String> collection, int i) {
        return implode(collection, ",", i);
    }

    public static <K, V> boolean isEmpty(java.util.Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    public static <K, V> java.util.Map<K, V> map(java.util.Map<K, V> map) {
        return map == null ? new java.util.HashMap() : new java.util.HashMap(map);
    }

    public static void putBooleanIfValid(java.lang.String str, java.lang.Boolean bool, java.util.Map map) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str) || bool == null) {
            return;
        }
        map.put(str, bool);
    }

    public static void putDoubleIfValid(java.lang.String str, java.lang.Double d, java.util.Map map) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str) || d == null) {
            return;
        }
        map.put(str, d);
    }

    public static void putFloatIfValid(java.lang.String str, java.lang.Float f, java.util.Map map) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str) || f == null) {
            return;
        }
        map.put(str, f);
    }

    public static void putIntegerIfValid(java.lang.String str, java.lang.Integer num, java.util.Map map) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str) || num == null) {
            return;
        }
        map.put(str, num);
    }

    public static void putJsonArrayIfValid(java.lang.String str, org.json.JSONArray jSONArray, java.util.Map map) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str) || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        map.put(str, jSONArray);
    }

    public static void putLongIfValid(java.lang.String str, java.lang.Long l, java.util.Map map) {
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str) || l == null) {
            return;
        }
        map.put(str, l);
    }

    public static void putObjectToStringIfValid(java.lang.String str, java.lang.Object obj, java.util.Map map) {
        if (obj == null) {
            return;
        }
        putStringIfValid(str, obj.toString(), map);
    }

    public static void putStringIfValid(java.lang.String str, java.lang.String str2, java.util.Map map) {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str) && com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
            map.put(str, str2);
        }
    }

    public static java.util.List<java.lang.String> removeTrimmedEmptyStrings(java.util.List<java.lang.String> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String strTrim = it.next().trim();
            if (!android.text.TextUtils.isEmpty(strTrim)) {
                arrayList.add(strTrim);
            }
        }
        return arrayList;
    }

    public static <T> java.util.List<T> synchronizedList() {
        return synchronizedList(-1);
    }

    public static android.os.Bundle toBundle(java.util.Map<java.lang.String, ?> map) {
        if (map == null || map.size() == 0) {
            return new android.os.Bundle();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : map.keySet()) {
            java.lang.Object obj = map.get(str);
            if (obj instanceof java.util.Map) {
                bundle.putBundle(str, toBundle((java.util.Map) obj));
            } else if (obj instanceof java.lang.Boolean) {
                bundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.lang.String) {
                bundle.putString(str, (java.lang.String) obj);
            } else if (obj instanceof java.lang.Integer) {
                bundle.putInt(str, ((java.lang.Integer) obj).intValue());
            } else if (obj instanceof java.lang.Long) {
                bundle.putLong(str, ((java.lang.Long) obj).longValue());
            } else if (obj instanceof java.lang.Double) {
                bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
            } else if (obj instanceof android.os.Parcelable) {
                bundle.putParcelable(str, (android.os.Parcelable) obj);
            }
        }
        return bundle;
    }

    public static org.json.JSONArray toJSONArray(java.lang.String[] strArr) {
        if (strArr == null) {
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (java.lang.String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static org.json.JSONObject toJson(java.util.Map<java.lang.String, ?> map) throws org.json.JSONException {
        if (map == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static java.lang.String toJsonString(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        try {
            return toJson(map).toString();
        } catch (org.json.JSONException e) {
            com.applovin.impl.sdk.n.c("CollectionUtils", "Failed to convert map '" + map + "' to JSON string.", e);
            return str;
        }
    }

    public static java.util.List<java.lang.String> explode(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.isEmpty(str) ? java.util.Collections.emptyList() : java.util.Arrays.asList(str.split(str2));
    }

    public static boolean getBoolean(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, boolean z) {
        if (map != null && map.containsKey(str)) {
            java.lang.Object obj = map.get(str);
            if (obj instanceof java.lang.String) {
                return java.lang.Boolean.parseBoolean((java.lang.String) obj);
            }
            if (obj instanceof java.lang.Boolean) {
                return ((java.lang.Boolean) obj).booleanValue();
            }
            if (obj instanceof java.lang.Number) {
                return ((java.lang.Number) obj).intValue() >= 1;
            }
        }
        return z;
    }

    public static java.lang.String implode(java.util.Collection<java.lang.String> collection, java.lang.String str, int i) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("No glue specified");
        }
        if (collection == null || collection.size() < 1) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = 0;
        for (java.lang.String str2 : collection) {
            if (i2 >= i) {
                break;
            }
            i2++;
            sb.append(str2).append(str);
        }
        if (sb.length() > str.length()) {
            sb.setLength(sb.length() - str.length());
        }
        return sb.toString();
    }

    public static <E> boolean isEmpty(java.util.Collection<E> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <T> java.util.List<T> synchronizedList(int i) {
        return i >= 0 ? java.util.Collections.synchronizedList(new java.util.ArrayList(i)) : java.util.Collections.synchronizedList(new java.util.ArrayList());
    }

    public static <K, V> java.util.Map<K, V> map(K k, V v) {
        java.util.HashMap map = new java.util.HashMap(1);
        map.put(k, v);
        return map;
    }
}
