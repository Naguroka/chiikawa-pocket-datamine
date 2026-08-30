package com.bytedance.sdk.openadsdk.core.VB.IL;

/* JADX INFO: loaded from: classes4.dex */
public class bX extends com.bytedance.adsdk.ugeno.WR.bX.bg {
    public bX(android.content.Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.WR.bX.bg
    public java.lang.String iR(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "unmuted":
                return "tt_reward_full_unmute";
            case "feedback":
                return "tt_reward_full_feedback";
            case "logo":
                return "tt_ad_logo";
            case "close":
                return "tt_close_btn";
            case "muted":
                return "tt_reward_full_mute";
            default:
                return null;
        }
    }
}
