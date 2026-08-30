package com.unity3d.services.core.misc;

/* JADX INFO: loaded from: classes6.dex */
public class JsonFlattenerRules {
    java.util.List<java.lang.String> _reduceKeys;
    java.util.List<java.lang.String> _skipKeys;
    java.util.List<java.lang.String> _topLevelToInclude;

    public JsonFlattenerRules(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3) {
        this._topLevelToInclude = list;
        this._reduceKeys = list2;
        this._skipKeys = list3;
    }

    public java.util.List<java.lang.String> getTopLevelToInclude() {
        return this._topLevelToInclude;
    }

    public java.util.List<java.lang.String> getReduceKeys() {
        return this._reduceKeys;
    }

    public java.util.List<java.lang.String> getSkipKeys() {
        return this._skipKeys;
    }
}
