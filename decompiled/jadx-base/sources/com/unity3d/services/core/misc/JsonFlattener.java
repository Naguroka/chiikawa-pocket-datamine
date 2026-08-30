package com.unity3d.services.core.misc;

/* JADX INFO: loaded from: classes6.dex */
public class JsonFlattener {
    private final org.json.JSONObject _jsonData;

    public JsonFlattener(org.json.JSONObject jSONObject) {
        this._jsonData = jSONObject;
    }

    public org.json.JSONObject flattenJson(java.lang.String str, com.unity3d.services.core.misc.JsonFlattenerRules jsonFlattenerRules) {
        if (jsonFlattenerRules == null) {
            return new org.json.JSONObject();
        }
        return flattenJson(str, jsonFlattenerRules.getTopLevelToInclude(), jsonFlattenerRules.getReduceKeys(), jsonFlattenerRules.getSkipKeys());
    }

    public org.json.JSONObject flattenJson(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.Iterator<java.lang.String> itKeys = this._jsonData.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                if (shouldIncludeKey(next, list, list3)) {
                    java.lang.Object objOpt = this._jsonData.opt(next);
                    if (objOpt instanceof org.json.JSONObject) {
                        new com.unity3d.services.core.misc.JsonFlattener((org.json.JSONObject) objOpt).flattenJson(str, next, jSONObject, list2, list3);
                    } else {
                        jSONObject.put(next, objOpt);
                    }
                }
            }
        } catch (org.json.JSONException e) {
            com.unity3d.services.core.log.DeviceLog.error("Could not flatten JSON: %s", e.getMessage());
        }
        return jSONObject;
    }

    public void flattenJson(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) throws org.json.JSONException {
        java.util.Iterator<java.lang.String> itKeys = this._jsonData.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            if (!list2.contains(next)) {
                java.lang.Object obj = this._jsonData.get(next);
                java.lang.String str3 = list.contains(next) ? str2 : java.lang.String.format("%s%s%s", str2, str, next);
                if (obj instanceof org.json.JSONObject) {
                    new com.unity3d.services.core.misc.JsonFlattener((org.json.JSONObject) obj).flattenJson(str, str3, jSONObject, list, list2);
                } else {
                    jSONObject.put(str3, obj);
                }
            }
        }
    }

    private boolean shouldIncludeKey(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        if (!list2.contains(str) && list.size() > 0) {
            return list.contains(str);
        }
        return false;
    }
}
