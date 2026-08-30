package com.bytedance.sdk.openadsdk.component.reward.bg;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private static final android.util.SparseArray<java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.model.tuV>> bg = new android.util.SparseArray<>();

    public static void bg(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar, android.content.Intent intent, android.os.Bundle bundle) {
        bg(intent, bgVar);
        bg(bundle, bgVar);
    }

    public static com.bytedance.sdk.openadsdk.core.model.tuV bg(android.content.Intent intent, android.os.Bundle bundle, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il) {
        com.bytedance.sdk.openadsdk.core.model.tuV fy = null;
        if (!com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            com.bytedance.sdk.openadsdk.core.model.bg bgVarIR = com.bytedance.sdk.openadsdk.core.JAA.bg().iR();
            fy = bgVarIR != null ? new com.bytedance.sdk.openadsdk.core.model.Fy(bgVarIR) : null;
            if (il != null) {
                il.bg(bundle);
            }
            com.bytedance.sdk.openadsdk.core.JAA.bg().ldr();
        } else if (intent != null) {
            try {
                java.lang.String stringExtra = intent.getStringExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_AD_INFO);
                if (stringExtra != null) {
                    fy = new com.bytedance.sdk.openadsdk.core.model.Fy(com.bytedance.sdk.openadsdk.core.model.bg.IL(new org.json.JSONObject(stringExtra)));
                }
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.RFDM", "", e);
            }
        }
        if (bundle != null) {
            try {
                java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.model.tuV> weakReference = bg.get(bundle.getInt("meta_tmp"));
                if (weakReference != null) {
                    fy = weakReference.get();
                }
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.RFDM", "", th);
            }
        }
        if (fy != null) {
            fy.bg(fy.xxp(), 7);
        }
        return fy;
    }

    public static void bg(android.content.Intent intent, com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        if (intent == null) {
            return;
        }
        bgVar.rri.bX(intent.getBooleanExtra("video_is_cached", false));
        bgVar.Pae = intent.getStringExtra("multi_process_listener_key");
        bgVar.bCU = intent.getIntExtra("orientation_angle", 0) == 3;
    }

    public static void bg(android.os.Bundle bundle, com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        if (bundle == null) {
            return;
        }
        bgVar.Pae = bundle.getString("multi_process_listener_key");
        bgVar.rri.bX(bundle.getBoolean("video_is_cached", false));
        bgVar.RJ = bundle.getBoolean("is_mute");
        if (bundle.getLong("video_current") > 0) {
            bgVar.rri.bg(bundle.getLong("video_current", 0L));
        }
        bgVar.bg(bundle.getBoolean("has_show_skip_btn"));
    }

    public static void bg(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = bgVar.IL;
            bg.append(tuv.hashCode(), new java.lang.ref.WeakReference<>(tuv));
            bundle.putInt("meta_tmp", tuv.hashCode());
            bundle.putString("multi_process_listener_key", bgVar.Pae);
            bundle.putBoolean("video_is_cached", bgVar.rri.kMt());
            bundle.putLong("video_current", bgVar.rri.iR());
            bundle.putBoolean("is_mute", bgVar.RJ);
            bundle.putBoolean("has_show_skip_btn", bgVar.Ld);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.RFDM", "onSaveInstanceState: ", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    public static void bg(android.content.Intent intent, android.app.Activity activity, boolean z, com.bytedance.sdk.openadsdk.core.model.bg bgVar, java.lang.String str) {
        int rotation;
        org.json.JSONObject jSONObjectPX;
        if (activity == null) {
            intent.addFlags(268435456);
        } else {
            try {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.RFDM", "", e);
                rotation = 0;
            }
            intent.putExtra("orientation_angle", rotation);
            intent.putExtra("video_is_cached", z);
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                jSONObjectPX = bgVar.PX();
                if (jSONObjectPX == null) {
                    com.bytedance.sdk.component.utils.PX.IL("toJsonObj return null");
                    return;
                } else {
                    intent.putExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_AD_INFO, jSONObjectPX.toString());
                    intent.putExtra("multi_process_listener_key", str);
                    return;
                }
            }
            com.bytedance.sdk.openadsdk.core.JAA.bg().ldr();
            com.bytedance.sdk.openadsdk.core.JAA.bg().bg(bgVar);
        }
        rotation = 0;
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra("video_is_cached", z);
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            jSONObjectPX = bgVar.PX();
            if (jSONObjectPX == null) {
                com.bytedance.sdk.component.utils.PX.IL("toJsonObj return null");
                return;
            } else {
                intent.putExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_AD_INFO, jSONObjectPX.toString());
                intent.putExtra("multi_process_listener_key", str);
                return;
            }
        }
        com.bytedance.sdk.openadsdk.core.JAA.bg().ldr();
        com.bytedance.sdk.openadsdk.core.JAA.bg().bg(bgVar);
    }
}
