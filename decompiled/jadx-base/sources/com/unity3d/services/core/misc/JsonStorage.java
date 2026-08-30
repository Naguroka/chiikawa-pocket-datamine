package com.unity3d.services.core.misc;

/* JADX INFO: loaded from: classes6.dex */
public class JsonStorage implements com.unity3d.services.core.misc.IJsonStorageReader {
    private org.json.JSONObject _data;

    public synchronized boolean initData() {
        if (this._data != null) {
            return false;
        }
        this._data = new org.json.JSONObject();
        return true;
    }

    public synchronized void setData(org.json.JSONObject jSONObject) {
        this._data = jSONObject;
    }

    @Override // com.unity3d.services.core.misc.IJsonStorageReader
    public synchronized org.json.JSONObject getData() {
        return this._data;
    }

    public synchronized boolean hasData() {
        org.json.JSONObject jSONObject = this._data;
        return jSONObject != null && jSONObject.length() > 0;
    }

    public synchronized void clearData() {
        this._data = null;
    }

    public synchronized boolean set(java.lang.String str, java.lang.Object obj) {
        if (this._data != null && str != null && str.length() != 0 && obj != null) {
            createObjectTree(getParentObjectTreeFor(str));
            if (findObject(getParentObjectTreeFor(str)) instanceof org.json.JSONObject) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) findObject(getParentObjectTreeFor(str));
                java.lang.String[] strArrSplit = str.split("\\.");
                if (jSONObject != null) {
                    try {
                        jSONObject.put(strArrSplit[strArrSplit.length - 1], obj);
                    } catch (org.json.JSONException e) {
                        com.unity3d.services.core.log.DeviceLog.exception("Couldn't set value", e);
                        return false;
                    }
                }
                return true;
            }
            com.unity3d.services.core.log.DeviceLog.debug("Cannot set subvalue to an object that is not JSONObject");
            return false;
        }
        com.unity3d.services.core.log.DeviceLog.error("Storage not properly initialized or incorrect parameters:" + this._data + ", " + str + ", " + obj);
        return false;
    }

    @Override // com.unity3d.services.core.misc.IJsonStorageReader
    public synchronized java.lang.Object get(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject;
        java.lang.Object obj = null;
        if (this._data == null) {
            com.unity3d.services.core.log.DeviceLog.error("Data is NULL, readStorage probably not called");
            return null;
        }
        java.lang.String[] strArrSplit = str.split("\\.");
        if (!(findObject(getParentObjectTreeFor(str)) instanceof org.json.JSONObject) || (jSONObject = (org.json.JSONObject) findObject(getParentObjectTreeFor(str))) == null) {
            return null;
        }
        try {
            if (jSONObject.has(strArrSplit[strArrSplit.length - 1])) {
                obj = jSONObject.get(strArrSplit[strArrSplit.length - 1]);
            }
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error getting data", e);
        }
        return obj;
    }

    public synchronized java.util.List<java.lang.String> getKeys(java.lang.String str, boolean z) {
        if (!(get(str) instanceof org.json.JSONObject)) {
            return null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) get(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.util.List<java.lang.String> keys = z ? getKeys(str + "." + next, z) : null;
                arrayList.add(next);
                if (keys != null) {
                    java.util.Iterator<java.lang.String> it = keys.iterator();
                    while (it.hasNext()) {
                        arrayList.add(next + "." + it.next());
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized boolean delete(java.lang.String str) {
        org.json.JSONObject jSONObject;
        if (this._data == null) {
            com.unity3d.services.core.log.DeviceLog.error("Data is NULL, readStorage probably not called");
            return false;
        }
        java.lang.String[] strArrSplit = str.split("\\.");
        return (!(findObject(getParentObjectTreeFor(str)) instanceof org.json.JSONObject) || (jSONObject = (org.json.JSONObject) findObject(getParentObjectTreeFor(str))) == null || jSONObject.remove(strArrSplit[strArrSplit.length - 1]) == null) ? false : true;
    }

    private synchronized java.lang.Object findObject(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split("\\.");
        org.json.JSONObject jSONObject = this._data;
        if (str.length() == 0) {
            return jSONObject;
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!jSONObject.has(strArrSplit[i])) {
                return null;
            }
            try {
                jSONObject = jSONObject.getJSONObject(strArrSplit[i]);
            } catch (java.lang.Exception e) {
                com.unity3d.services.core.log.DeviceLog.exception("Couldn't read JSONObject: " + strArrSplit[i], e);
                return null;
            }
        }
        return jSONObject;
    }

    private synchronized void createObjectTree(java.lang.String str) {
        try {
            java.lang.String[] strArrSplit = str.split("\\.");
            org.json.JSONObject jSONObject = this._data;
            if (str.length() == 0) {
                return;
            }
            for (int i = 0; i < strArrSplit.length; i++) {
                if (!jSONObject.has(strArrSplit[i])) {
                    try {
                        jSONObject = jSONObject.put(strArrSplit[i], new org.json.JSONObject()).getJSONObject(strArrSplit[i]);
                    } catch (java.lang.Exception e) {
                        com.unity3d.services.core.log.DeviceLog.exception("Couldn't create new JSONObject", e);
                    }
                } else {
                    try {
                        jSONObject = jSONObject.getJSONObject(strArrSplit[i]);
                    } catch (java.lang.Exception e2) {
                        com.unity3d.services.core.log.DeviceLog.exception("Couldn't get existing JSONObject", e2);
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private synchronized java.lang.String getParentObjectTreeFor(java.lang.String str) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList(java.util.Arrays.asList(str.split("\\.")));
        arrayList.remove(arrayList.size() - 1);
        return android.text.TextUtils.join(".", arrayList.toArray());
    }
}
