package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class B extends com.onevcat.uniwebview.D {
    public B(java.lang.String webViewName, android.webkit.PermissionRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewName, "webViewName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        java.lang.String[] resources = request.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "request.resources");
        java.util.ArrayList arrayList = new java.util.ArrayList(resources.length);
        int length = resources.length;
        int i = 0;
        while (true) {
            java.lang.String str = "";
            if (i >= length) {
                break;
            }
            java.lang.String str2 = resources[i];
            if (str2 != null) {
                int iHashCode = str2.hashCode();
                if (iHashCode != -1660821873) {
                    if (iHashCode != 968612586) {
                        if (iHashCode != 1069496794) {
                            if (iHashCode == 1233677653 && str2.equals("android.webkit.resource.MIDI_SYSEX")) {
                                str = "MIDI_SYSEX";
                            }
                        } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                            str = "PROTECTED_MEDIA_ID";
                        }
                    } else if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        str = "AUDIO";
                    }
                } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    str = "VIDEO";
                }
            }
            arrayList.add(str);
            i++;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        java.lang.String scheme = request.getOrigin().getScheme();
        kotlin.Pair pair = kotlin.TuplesKt.to("protocol", scheme == null ? "" : scheme);
        java.lang.String host = request.getOrigin().getHost();
        java.lang.String string = new org.json.JSONObject(kotlin.collections.MapsKt.mapOf(pair, kotlin.TuplesKt.to("host", host != null ? host : ""), kotlin.TuplesKt.to(org.jacoco.core.runtime.AgentOptions.PORT, java.lang.Integer.valueOf(request.getOrigin().getPort())), kotlin.TuplesKt.to("resources", arrayList2))).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "obj.toString()");
        super(webViewName, "RequestMediaCapturePermission", string);
    }
}
