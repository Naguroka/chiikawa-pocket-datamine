package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbv {
    public static android.graphics.Point zza(android.view.MotionEvent motionEvent, android.view.View view) {
        int[] iArrZzj = zzj(view);
        return new android.graphics.Point(((int) motionEvent.getRawX()) - iArrZzj[0], ((int) motionEvent.getRawY()) - iArrZzj[1]);
    }

    public static android.view.WindowManager.LayoutParams zzb() {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhT)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static org.json.JSONObject zzc(java.lang.String str, android.content.Context context, android.graphics.Point point, android.graphics.Point point2) {
        org.json.JSONObject jSONObject = null;
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point2.x));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point2.y));
                    jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point.x));
                    jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, point.y));
                    jSONObject = jSONObject3;
                } catch (org.json.JSONException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (java.lang.Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
        }
    }

    public static org.json.JSONObject zzd(android.content.Context context, java.util.Map map, java.util.Map map2, android.view.View view, android.widget.ImageView.ScaleType scaleType) {
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        java.lang.String str3 = "ad_view";
        java.lang.String str4 = "relative_to";
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (map != null && view != null) {
            int[] iArrZzj = zzj(view);
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArrZzj2 = zzj(view2);
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    java.util.Iterator it2 = it;
                    try {
                        org.json.JSONObject jSONObject6 = jSONObject3;
                        try {
                            jSONObject5.put("width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, view2.getMeasuredWidth()));
                            jSONObject5.put("height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, view2.getMeasuredHeight()));
                            jSONObject5.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj2[0] - iArrZzj[0]));
                            jSONObject5.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj2[1] - iArrZzj[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, jSONObject5);
                            android.graphics.Rect rect = new android.graphics.Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = zzk(context, rect);
                            } else {
                                jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj2[0] - iArrZzj[0]));
                                jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj2[1] - iArrZzj[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((java.lang.String) entry.getKey()).equals("3010")) {
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhO)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhP)).booleanValue()) {
                                    android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject4.put("view_width_layout_type", zzl(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", zzl(layoutParams.height) - 1);
                                }
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhQ)).booleanValue()) {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    arrayList.add(java.lang.Integer.valueOf(view2.getId()));
                                    for (android.view.ViewParent parent = view2.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                                        arrayList.add(java.lang.Integer.valueOf(((android.view.View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", android.text.TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof android.widget.TextView) {
                                android.widget.TextView textView = (android.widget.TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject4.put("font_size", textView.getTextSize());
                                    jSONObject4.put("text", textView.getText());
                                } catch (org.json.JSONException unused) {
                                    jSONObject = jSONObject6;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to get asset views information");
                                    it = it2;
                                    jSONObject3 = jSONObject;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject = jSONObject6;
                            try {
                                jSONObject.put((java.lang.String) entry.getKey(), jSONObject4);
                            } catch (org.json.JSONException unused2) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to get asset views information");
                            }
                        } catch (org.json.JSONException unused3) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (org.json.JSONException unused4) {
                        str = str3;
                        str2 = str4;
                        jSONObject = jSONObject3;
                    }
                    it = it2;
                    jSONObject3 = jSONObject;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject3;
    }

    public static org.json.JSONObject zze(android.content.Context context, android.view.View view) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (view != null) {
            try {
                com.google.android.gms.ads.internal.zzv.zzq();
                jSONObject.put("can_show_on_lock_screen", com.google.android.gms.ads.internal.util.zzs.zzo(view));
                com.google.android.gms.ads.internal.zzv.zzq();
                jSONObject.put("is_keyguard_locked", com.google.android.gms.ads.internal.util.zzs.zzE(context));
            } catch (org.json.JSONException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static org.json.JSONObject zzf(android.view.View view) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (view != null) {
            try {
                boolean z = false;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhN)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    android.view.ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof android.widget.ScrollView)) {
                        parent = parent.getParent();
                    }
                    if (parent != null) {
                        z = true;
                    }
                    jSONObject.put("contained_in_scroll_view", z);
                } else {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    android.view.ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof android.widget.AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent2 == null ? -1 : ((android.widget.AdapterView) parent2).getPositionForView(view)) != -1);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x014e  */
    public static org.json.JSONObject zzg(android.content.Context context, android.view.View view) {
        java.lang.String str;
        byte b;
        org.json.JSONObject jSONObjectZzk;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (view != null) {
            try {
                int[] iArrZzj = zzj(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.ViewGroup; parent = parent.getParent()) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    iArr[0] = java.lang.Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                    iArr[1] = java.lang.Math.min(viewGroup.getMeasuredHeight(), iArr[1]);
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, view.getMeasuredWidth()));
                jSONObject2.put("height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, view.getMeasuredHeight()));
                jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj[0]));
                jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj[1]));
                jSONObject2.put("maximum_visible_width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArr[0]));
                jSONObject2.put("maximum_visible_height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArr[1]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, jSONObject2);
                android.graphics.Rect rect = new android.graphics.Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectZzk = zzk(context, rect);
                } else {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj[0]));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, iArrZzj[1]));
                    jSONObject3.put("relative_to", "window");
                    jSONObjectZzk = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectZzk);
            } catch (java.lang.Exception unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to get native ad view bounding box");
            }
            android.view.ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                try {
                    str = (java.lang.String) parent2.getClass().getMethod("getTemplateTypeName", new java.lang.Class[0]).invoke(parent2, new java.lang.Object[0]);
                } catch (java.lang.IllegalAccessException e) {
                    e = e;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                } catch (java.lang.NoSuchMethodException unused2) {
                    str = "";
                } catch (java.lang.SecurityException e2) {
                    e = e2;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                } catch (java.lang.reflect.InvocationTargetException e3) {
                    e = e3;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                }
            } else {
                str = "";
            }
            try {
                int iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode == 2019754500 && str.equals("medium_template")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("small_template")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    jSONObject.put("native_template_type", 1);
                } else if (b != 1) {
                    jSONObject.put("native_template_type", 0);
                } else {
                    jSONObject.put("native_template_type", 2);
                }
            } catch (org.json.JSONException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Could not log native template signal to JSON", e4);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhP)).booleanValue()) {
                try {
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    jSONObject.put("view_width_layout_type", zzl(layoutParams.width) - 1);
                    jSONObject.put("view_height_layout_type", zzl(layoutParams.height) - 1);
                } catch (java.lang.Exception unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Unable to get native ad view layout types");
                }
            }
        }
        return jSONObject;
    }

    public static boolean zzh(android.content.Context context, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        if (!zzfboVar.zzN) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhR)).booleanValue()) {
            return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhU)).booleanValue();
        }
        java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhS);
        if (!str.isEmpty() && context != null) {
            java.lang.String packageName = context.getPackageName();
            java.util.Iterator it = com.google.android.gms.internal.ads.zzfvc.zzb(com.google.android.gms.internal.ads.zzfty.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((java.lang.String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean zzi(int i) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdB)).booleanValue()) {
            return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdC)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    public static int[] zzj(android.view.View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static org.json.JSONObject zzk(android.content.Context context, android.graphics.Rect rect) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzl(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }
}
