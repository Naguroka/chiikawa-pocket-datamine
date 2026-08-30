package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String f2554a = "SSA_CORE.SDKController.runFunction";

    public static java.lang.String a(com.json.d9 d9Var) {
        return java.lang.String.format("%1$s('%2$s%3$s'%4$s)", f2554a, d9Var.b(), a(d9Var.c()), b(d9Var));
    }

    private static java.lang.String a(org.json.JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? "" : jSONObject.toString();
    }

    private static java.lang.String b(com.json.d9 d9Var) {
        return (d9Var.d() == null || d9Var.a() == null) ? "" : java.lang.String.format(", '%1$s', '%2$s'", d9Var.d(), d9Var.a());
    }
}
