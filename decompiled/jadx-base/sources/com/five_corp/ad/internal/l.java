package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class l {
    static {
        com.five_corp.ad.internal.l.class.toString();
    }

    public static com.five_corp.ad.internal.ad.a a(org.json.JSONObject jSONObject) throws org.json.JSONException, com.five_corp.ad.internal.exception.b {
        int i;
        int i2;
        com.five_corp.ad.internal.ad.u uVar;
        com.five_corp.ad.internal.ad.q qVar;
        java.lang.String str;
        int i3;
        com.five_corp.ad.internal.ad.w wVar;
        int i4;
        int i5;
        long j;
        com.five_corp.ad.internal.ad.w wVar2;
        com.five_corp.ad.internal.ad.w wVar3;
        com.five_corp.ad.internal.ad.m mVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List list;
        java.util.ArrayList arrayList3;
        com.five_corp.ad.internal.ad.g gVar;
        java.util.List list2;
        com.five_corp.ad.internal.ad.w wVar4;
        com.five_corp.ad.internal.ad.w wVar5;
        com.five_corp.ad.internal.ad.w wVar6;
        com.five_corp.ad.internal.ad.w wVar7;
        com.five_corp.ad.internal.ad.w wVar8;
        com.five_corp.ad.internal.ad.w wVar9;
        int i6;
        com.five_corp.ad.internal.ad.fullscreen.j jVar;
        int i7;
        com.five_corp.ad.internal.ad.fullscreen.f fVar;
        com.five_corp.ad.internal.ad.fullscreen.o oVar;
        com.five_corp.ad.internal.ad.fullscreen.p pVar;
        java.lang.String str2;
        com.five_corp.ad.internal.ad.fullscreen.f fVar2;
        com.five_corp.ad.internal.ad.fullscreen.o oVar2;
        com.five_corp.ad.internal.ad.beacon.e eVar;
        org.json.JSONArray jSONArray;
        java.util.ArrayList arrayList4;
        int i8;
        java.lang.String string;
        com.five_corp.ad.internal.ad.h hVar;
        java.lang.String string2 = jSONObject.toString();
        java.lang.String string3 = jSONObject.getString("ots");
        long j2 = jSONObject.getLong("ts");
        com.five_corp.ad.internal.ad.f fVar3 = new com.five_corp.ad.internal.ad.f(jSONObject.getInt("cm"), jSONObject.getInt("cmv"), jSONObject.getInt("cr"));
        long j3 = jSONObject.getLong("cmt");
        com.five_corp.ad.internal.ad.w wVar10 = new com.five_corp.ad.internal.ad.w(jSONObject.getString("m"), null, 0, 0);
        int i9 = jSONObject.getInt("mms");
        if (jSONObject.has("mpt")) {
            int i10 = jSONObject.getInt("mpt");
            int[] iArrB = com.five_corp.ad.e.b(3);
            int length = iArrB.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.c1, i10);
                }
                i = iArrB[i11];
                if (com.five_corp.ad.internal.ad.r.a(i) == i10) {
                    break;
                }
                i11++;
            }
        } else {
            i = 1;
        }
        if (jSONObject.has("mpv")) {
            int i12 = jSONObject.getInt("mpv");
            int[] iArrB2 = com.five_corp.ad.e.b(2);
            int length2 = iArrB2.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.A1, i12);
                }
                int i14 = iArrB2[i13];
                if (com.five_corp.ad.internal.ad.s.a(i14) == i12) {
                    i2 = i14;
                    break;
                }
                i13++;
            }
        } else {
            i2 = 1;
        }
        if (jSONObject.has("ppc")) {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("ppc");
            uVar = new com.five_corp.ad.internal.ad.u(jSONObject2.getLong("stm"), jSONObject2.getLong("pre"));
        } else {
            uVar = null;
        }
        if (jSONObject.has("mpc")) {
            org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("mpc");
            java.lang.Long lValueOf = jSONObject3.has("sto") ? java.lang.Long.valueOf(jSONObject3.getLong("sto")) : null;
            if (jSONObject3.has("fpc")) {
                org.json.JSONObject jSONObject4 = jSONObject3.getJSONObject("fpc");
                hVar = new com.five_corp.ad.internal.ad.h(jSONObject4.has("dtms") ? jSONObject4.getLong("dtms") : 10000L);
            } else {
                hVar = null;
            }
            qVar = new com.five_corp.ad.internal.ad.q(lValueOf, hVar);
        } else {
            qVar = null;
        }
        java.lang.Long lValueOf2 = jSONObject.has("maltms") ? java.lang.Long.valueOf(jSONObject.getLong("maltms")) : null;
        if (jSONObject.has("pi")) {
            str = null;
            i3 = 0;
            wVar = new com.five_corp.ad.internal.ad.w(jSONObject.getString("pi"), null, 0, 0);
        } else {
            str = null;
            i3 = 0;
            wVar = null;
        }
        com.five_corp.ad.internal.ad.w wVar11 = jSONObject.has(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT) ? new com.five_corp.ad.internal.ad.w(jSONObject.getString(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT), str, i3, i3) : null;
        com.five_corp.ad.internal.ad.w wVarH = jSONObject.has("ic") ? h(jSONObject.getJSONObject("ic")) : null;
        com.five_corp.ad.internal.ad.w wVarH2 = jSONObject.has("iic") ? h(jSONObject.getJSONObject("iic")) : null;
        if (jSONObject.has("rt")) {
            int i15 = jSONObject.getInt("rt");
            int[] iArrB3 = com.five_corp.ad.e.b(5);
            int length3 = iArrB3.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length3) {
                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.D0, i15);
                }
                int i17 = iArrB3[i16];
                int i18 = length3;
                if (com.five_corp.ad.e.a(i17) == i15) {
                    i4 = i17;
                    break;
                }
                i16++;
                length3 = i18;
            }
        } else {
            i4 = 1;
        }
        com.five_corp.ad.internal.ad.v vVar = new com.five_corp.ad.internal.ad.v(i4, jSONObject.optString("ru", null), jSONObject.optString("fbu", null), jSONObject.has("au") ? jSONObject.getString("au") : null);
        if (jSONObject.has("ort")) {
            int i19 = jSONObject.getInt("ort");
            int[] iArrB4 = com.five_corp.ad.e.b(2);
            int length4 = iArrB4.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length4) {
                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.t1, i19);
                }
                int i21 = length4;
                if (com.five_corp.ad.e.a(iArrB4[i20]) == i19) {
                    break;
                }
                i20++;
                length4 = i21;
            }
        }
        java.lang.String string4 = jSONObject.has("iu") ? jSONObject.getString("iu") : null;
        if (jSONObject.has("info_icon")) {
            org.json.JSONObject jSONObject5 = jSONObject.getJSONObject("info_icon");
            org.json.JSONObject jSONObject6 = jSONObject5.getJSONObject("ca");
            int i22 = jSONObject6.getInt("at");
            int i23 = 2;
            int[] iArrB5 = com.five_corp.ad.e.b(2);
            int length5 = iArrB5.length;
            int i24 = 0;
            while (true) {
                if (i24 >= length5) {
                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.F1, i22);
                }
                int i25 = length5;
                int i26 = iArrB5[i24];
                int[] iArr = iArrB5;
                if (com.five_corp.ad.internal.ad.j.a(i26) == i22) {
                    org.json.JSONArray jSONArrayOptJSONArray = jSONObject6.optJSONArray("chs");
                    if (i23 == i26 && (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0)) {
                        throw new org.json.JSONException("chs is required when informationIconClickActionType is SHOW_CHOICES");
                    }
                    if (jSONArrayOptJSONArray != null) {
                        arrayList4 = new java.util.ArrayList();
                        int i27 = 0;
                        while (i27 < jSONArrayOptJSONArray.length()) {
                            org.json.JSONObject jSONObject7 = jSONArrayOptJSONArray.getJSONObject(i27);
                            org.json.JSONArray jSONArray2 = jSONArrayOptJSONArray;
                            java.lang.String string5 = jSONObject7.getString("t");
                            com.five_corp.ad.internal.ad.w wVar12 = wVar;
                            int i28 = jSONObject7.getInt("cht");
                            com.five_corp.ad.internal.ad.w wVar13 = wVar10;
                            int[] iArrB6 = com.five_corp.ad.e.b(3);
                            int i29 = i9;
                            int length6 = iArrB6.length;
                            long j4 = j3;
                            int i30 = 0;
                            while (true) {
                                if (i30 >= length6) {
                                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.G1, i28);
                                }
                                i8 = iArrB6[i30];
                                int i31 = length6;
                                if (com.five_corp.ad.internal.ad.l.a(i8) == i28) {
                                    break;
                                }
                                i30++;
                                length6 = i31;
                            }
                            if (3 != i8) {
                                string = null;
                            } else {
                                if (jSONObject7.isNull("url")) {
                                    throw new org.json.JSONException("url is required when informationIconClickChoiceType is OPEN_URL_OF_SPECIFIED");
                                }
                                string = jSONObject7.getString("url");
                            }
                            arrayList4.add(new com.five_corp.ad.internal.ad.k(string5, i8, string));
                            i27++;
                            wVar10 = wVar13;
                            jSONArrayOptJSONArray = jSONArray2;
                            wVar = wVar12;
                            i9 = i29;
                            j3 = j4;
                        }
                        i5 = i9;
                        j = j3;
                        wVar2 = wVar;
                        wVar3 = wVar10;
                    } else {
                        i5 = i9;
                        j = j3;
                        wVar2 = wVar;
                        wVar3 = wVar10;
                        arrayList4 = null;
                    }
                    com.five_corp.ad.internal.ad.i iVar = new com.five_corp.ad.internal.ad.i(i26, arrayList4);
                    org.json.JSONObject jSONObject8 = jSONObject5.getJSONObject("rf");
                    com.five_corp.ad.internal.ad.m mVar2 = new com.five_corp.ad.internal.ad.m(iVar, new com.five_corp.ad.internal.ad.p(!jSONObject8.isNull("mes") ? jSONObject8.getString("mes") : null));
                    if (1 != i26 || string4 != null) {
                        if (arrayList4 != null) {
                            java.util.Iterator it = arrayList4.iterator();
                            while (it.hasNext()) {
                                if (1 == ((com.five_corp.ad.internal.ad.k) it.next()).b && string4 == null) {
                                    throw new org.json.JSONException("iu is required when informationIconClickChoiceType is OPEN_URL_OF_INFORMATION");
                                }
                            }
                        }
                        mVar = mVar2;
                        break;
                    }
                    throw new org.json.JSONException("iu is required when informationIconClickActionType is OPEN_URL_OF_INFORMATION");
                }
                i24++;
                length5 = i25;
                iArrB5 = iArr;
                i9 = i9;
                i23 = 2;
            }
        } else {
            i5 = i9;
            j = j3;
            wVar2 = wVar;
            wVar3 = wVar10;
            mVar = null;
        }
        if (jSONObject.has("blcksi")) {
            org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("blcksi");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (int i32 = 0; i32 < jSONArray3.length(); i32++) {
                arrayList5.add(jSONArray3.getString(i32));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("whitesi")) {
            org.json.JSONArray jSONArray4 = jSONObject.getJSONArray("whitesi");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            for (int i33 = 0; i33 < jSONArray4.length(); i33++) {
                arrayList6.add(jSONArray4.getString(i33));
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        java.lang.String string6 = jSONObject.has("an") ? jSONObject.getString("an") : null;
        java.lang.String string7 = jSONObject.has("ti") ? jSONObject.getString("ti") : null;
        java.lang.String string8 = jSONObject.has("bt") ? jSONObject.getString("bt") : null;
        java.lang.String string9 = jSONObject.has(com.json.ce.l0) ? jSONObject.getString(com.json.ce.l0) : null;
        java.lang.String string10 = jSONObject.has("ldt") ? jSONObject.getString("ldt") : null;
        java.util.List listEmptyList = java.util.Collections.emptyList();
        java.lang.String str3 = "c";
        if (jSONObject.has("tr")) {
            org.json.JSONArray jSONArray5 = jSONObject.getJSONArray("tr");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            int i34 = 0;
            while (i34 < jSONArray5.length()) {
                org.json.JSONObject jSONObject9 = jSONArray5.getJSONObject(i34);
                int i35 = jSONObject9.getInt("ev");
                com.five_corp.ad.internal.ad.beacon.e[] eVarArrValues = com.five_corp.ad.internal.ad.beacon.e.values();
                int length7 = eVarArrValues.length;
                int i36 = 0;
                while (true) {
                    if (i36 >= length7) {
                        throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.W0, i35);
                    }
                    eVar = eVarArrValues[i36];
                    jSONArray = jSONArray5;
                    if (eVar.f1793a == i35) {
                        break;
                    }
                    i36++;
                    jSONArray5 = jSONArray;
                }
                arrayList7.add(new com.five_corp.ad.internal.ad.beacon.d(eVar, jSONObject9.getString("u"), jSONObject9.has("c") ? b(jSONObject9.getJSONObject("c")) : null));
                i34++;
                jSONArray5 = jSONArray;
            }
            list = arrayList7;
        } else {
            list = listEmptyList;
        }
        org.json.JSONArray jSONArray6 = jSONObject.getJSONArray("scfg");
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        for (int i37 = 0; i37 < jSONArray6.length(); i37++) {
            org.json.JSONObject jSONObject10 = jSONArray6.getJSONObject(i37);
            arrayList8.add(new com.five_corp.ad.internal.ad.x(jSONObject10.getString(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS), jSONObject10.getInt("c")));
        }
        org.json.JSONArray jSONArray7 = jSONObject.getJSONArray("cfgs");
        java.util.ArrayList<com.five_corp.ad.internal.ad.format_config.a> arrayList9 = new java.util.ArrayList();
        int i38 = 0;
        while (i38 < jSONArray7.length()) {
            org.json.JSONObject jSONObject11 = jSONArray7.getJSONObject(i38);
            int i39 = jSONObject11.getInt("id");
            com.five_corp.ad.internal.ad.custom_layout.d dVarD = jSONObject11.has("lo") ? d(jSONObject11.getJSONObject("lo")) : null;
            if (jSONObject11.has(com.json.ce.J0)) {
                org.json.JSONObject jSONObject12 = jSONObject11.getJSONObject(com.json.ce.J0);
                int iA = jSONObject12.has("ori") ? com.five_corp.ad.internal.ad.fullscreen.k.a(jSONObject12.getInt("ori")) : 0;
                org.json.JSONObject jSONObject13 = jSONObject12.getJSONObject("fmid");
                int i40 = jSONObject13.getInt("t");
                if (1 == i40) {
                    throw new com.five_corp.ad.internal.exception.b(com.five_corp.ad.internal.t.O0, "");
                }
                int[] iArrB7 = com.five_corp.ad.e.b(2);
                int length8 = iArrB7.length;
                int i41 = 0;
                while (true) {
                    if (i41 >= length8) {
                        throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.O0, i40);
                    }
                    int i42 = length8;
                    if (com.five_corp.ad.internal.ad.fullscreen.i.a(iArrB7[i41]) == i40) {
                        org.json.JSONObject jSONObject14 = jSONObject13.getJSONObject("cf");
                        int iA2 = com.five_corp.ad.internal.ad.fullscreen.k.a(jSONObject14.getInt("o"));
                        boolean z = jSONObject14.has(str3) ? jSONObject14.getBoolean(str3) : false;
                        if (jSONObject14.has("ex")) {
                            org.json.JSONObject jSONObject15 = jSONObject14.getJSONObject("ex");
                            int iA3 = com.five_corp.ad.internal.ad.fullscreen.c.a(jSONObject15.getInt(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P));
                            org.json.JSONObject jSONObject16 = jSONObject15.getJSONObject(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                            fVar = new com.five_corp.ad.internal.ad.fullscreen.f(iA3, new com.five_corp.ad.internal.ad.fullscreen.d(jSONObject16.getDouble("pw"), jSONObject16.getDouble(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_PLAYBACK_RATE), jSONObject16.getDouble("lw"), jSONObject16.getDouble("lr")), f(jSONObject15.getJSONObject("o")));
                        } else {
                            fVar = null;
                        }
                        if (jSONObject14.has("rd")) {
                            org.json.JSONObject jSONObject17 = jSONObject14.getJSONObject("rd");
                            int iA4 = com.five_corp.ad.internal.ad.fullscreen.c.a(jSONObject17.getInt(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P));
                            org.json.JSONObject jSONObject18 = jSONObject17.getJSONObject(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                            oVar = new com.five_corp.ad.internal.ad.fullscreen.o(iA4, new com.five_corp.ad.internal.ad.fullscreen.d(jSONObject18.getDouble("pw"), jSONObject18.getDouble(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_PLAYBACK_RATE), jSONObject18.getDouble("lw"), jSONObject18.getDouble("lr")), f(jSONObject17.getJSONObject("o")));
                        } else {
                            oVar = null;
                        }
                        if (jSONObject14.has("sn")) {
                            org.json.JSONObject jSONObject19 = jSONObject14.getJSONObject("sn");
                            int iA5 = com.five_corp.ad.internal.ad.fullscreen.c.a(jSONObject19.getInt(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P));
                            org.json.JSONObject jSONObject20 = jSONObject19.getJSONObject(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                            pVar = new com.five_corp.ad.internal.ad.fullscreen.p(iA5, new com.five_corp.ad.internal.ad.fullscreen.d(jSONObject20.getDouble("pw"), jSONObject20.getDouble(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_PLAYBACK_RATE), jSONObject20.getDouble("lw"), jSONObject20.getDouble("lr")), f(jSONObject19.getJSONObject("eo")), f(jSONObject19.getJSONObject(com.json.ce.l1)));
                        } else {
                            pVar = null;
                        }
                        com.five_corp.ad.internal.ad.fullscreen.g gVar2 = new com.five_corp.ad.internal.ad.fullscreen.g(new com.five_corp.ad.internal.ad.fullscreen.h(iA2, z, fVar, oVar, pVar, jSONObject14.has("bg") ? h(jSONObject14.getJSONObject("bg")) : null, d(jSONObject14.getJSONObject("lo")), jSONObject14.has("lbg") ? h(jSONObject14.getJSONObject("lbg")) : null, jSONObject14.has("llo") ? d(jSONObject14.getJSONObject("llo")) : null));
                        org.json.JSONObject jSONObject21 = jSONObject12.getJSONObject("fpost");
                        int i43 = jSONObject21.getInt("tp");
                        if (1 == i43) {
                            throw new com.five_corp.ad.internal.exception.b(com.five_corp.ad.internal.t.C1, "");
                        }
                        int[] iArrB8 = com.five_corp.ad.e.b(2);
                        org.json.JSONObject jSONObject22 = jSONObject12;
                        int length9 = iArrB8.length;
                        int i44 = 0;
                        while (true) {
                            if (i44 >= length9) {
                                throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.V0, i43);
                            }
                            int i45 = length9;
                            if (com.five_corp.ad.internal.ad.fullscreen.n.a(iArrB8[i44]) == i43) {
                                org.json.JSONObject jSONObject23 = jSONObject21.getJSONObject("cf");
                                com.five_corp.ad.internal.ad.fullscreen.k.a(jSONObject23.getInt("o"));
                                boolean z2 = jSONObject23.has(str3) ? jSONObject23.getBoolean(str3) : false;
                                com.five_corp.ad.internal.ad.w wVarH3 = jSONObject23.has(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT) ? h(jSONObject23.getJSONObject(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)) : null;
                                if (jSONObject23.has(r5)) {
                                    org.json.JSONObject jSONObject24 = jSONObject23.getJSONObject("ex");
                                    int iA6 = com.five_corp.ad.internal.ad.fullscreen.c.a(jSONObject24.getInt(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P));
                                    org.json.JSONObject jSONObject25 = jSONObject24.getJSONObject(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                                    str2 = r15;
                                    fVar2 = new com.five_corp.ad.internal.ad.fullscreen.f(iA6, new com.five_corp.ad.internal.ad.fullscreen.d(jSONObject25.getDouble("pw"), jSONObject25.getDouble(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_PLAYBACK_RATE), jSONObject25.getDouble("lw"), jSONObject25.getDouble(str2)), f(jSONObject24.getJSONObject("o")));
                                } else {
                                    str2 = r15;
                                    fVar2 = null;
                                }
                                if (jSONObject23.has(r5)) {
                                    org.json.JSONObject jSONObject26 = jSONObject23.getJSONObject("rd");
                                    int iA7 = com.five_corp.ad.internal.ad.fullscreen.c.a(jSONObject26.getInt(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P));
                                    org.json.JSONObject jSONObject27 = jSONObject26.getJSONObject(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
                                    oVar2 = new com.five_corp.ad.internal.ad.fullscreen.o(iA7, new com.five_corp.ad.internal.ad.fullscreen.d(jSONObject27.getDouble("pw"), jSONObject27.getDouble(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_PLAYBACK_RATE), jSONObject27.getDouble("lw"), jSONObject27.getDouble(str2)), f(jSONObject26.getJSONObject("o")));
                                } else {
                                    oVar2 = null;
                                }
                                jVar = new com.five_corp.ad.internal.ad.fullscreen.j(iA, gVar2, new com.five_corp.ad.internal.ad.fullscreen.l(new com.five_corp.ad.internal.ad.fullscreen.m(z2, wVarH3, fVar2, oVar2, jSONObject23.has("bg") ? h(jSONObject23.getJSONObject("bg")) : null, d(jSONObject23.getJSONObject("lo")), jSONObject23.has("lbg") ? h(jSONObject23.getJSONObject("lbg")) : null, jSONObject23.has(r52) ? d(jSONObject23.getJSONObject("llo")) : null)), jSONObject22.has("bg") ? jSONObject22.getString("bg") : "FF000000");
                                break;
                            }
                            i44++;
                            str3 = str3;
                            length9 = i45;
                        }
                    } else {
                        i41++;
                        jSONObject12 = jSONObject12;
                        length8 = i42;
                    }
                }
            } else {
                str3 = str3;
                jSONObject11 = jSONObject11;
                arrayList = arrayList;
                jVar = null;
            }
            org.json.JSONObject jSONObject28 = jSONObject11;
            if (jSONObject28.has("vcm")) {
                int i46 = jSONObject28.getInt("vcm");
                int[] iArrB9 = com.five_corp.ad.e.b(2);
                int length10 = iArrB9.length;
                int i47 = 0;
                while (true) {
                    if (i47 >= length10) {
                        throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.z1, i46);
                    }
                    int i48 = iArrB9[i47];
                    if (com.five_corp.ad.e.a(i48) == i46) {
                        i7 = i48;
                        break;
                    }
                    i47++;
                }
            } else {
                i7 = 1;
            }
            com.five_corp.ad.internal.ad.format_config.a aVar = new com.five_corp.ad.internal.ad.format_config.a(i39, dVarD, jVar, i7);
            arrayList9 = arrayList9;
            arrayList9.add(aVar);
            i38++;
            jSONArray7 = jSONArray7;
            arrayList8 = arrayList8;
            arrayList = arrayList;
            string4 = string4;
            j2 = j2;
            str3 = str3;
        }
        long j5 = j2;
        java.util.ArrayList arrayList10 = arrayList8;
        java.lang.String str4 = string4;
        java.util.ArrayList arrayList11 = arrayList;
        com.five_corp.ad.internal.ad.beacon.j jVar2 = com.five_corp.ad.internal.ad.beacon.j.d;
        double d = jVar2.b;
        if (jSONObject.has("vtar")) {
            d = jSONObject.getDouble("vtar");
        }
        int i49 = jVar2.f1796a;
        if (jSONObject.has("vvct")) {
            int i50 = jSONObject.getInt("vvct");
            int[] iArrB10 = com.five_corp.ad.e.b(2);
            int length11 = iArrB10.length;
            int i51 = 0;
            while (true) {
                if (i51 >= length11) {
                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.D1, i50);
                }
                int i52 = iArrB10[i51];
                if (com.five_corp.ad.internal.ad.beacon.i.a(i52) == i50) {
                    i49 = i52;
                    break;
                }
                i51++;
            }
        }
        com.five_corp.ad.internal.ad.beacon.j jVar3 = new com.five_corp.ad.internal.ad.beacon.j(i49, d);
        com.five_corp.ad.internal.ad.beacon.f fVarE = e(jSONObject.getJSONObject("imp"));
        com.five_corp.ad.internal.ad.beacon.f fVarE2 = e(jSONObject.getJSONObject("vimp"));
        if (jSONObject.has("bcns")) {
            org.json.JSONArray jSONArray8 = jSONObject.getJSONArray("bcns");
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            for (int i53 = 0; i53 < jSONArray8.length(); i53++) {
                arrayList12.add(e(jSONArray8.getJSONObject(i53)));
            }
            arrayList3 = arrayList12;
        } else {
            arrayList3 = null;
        }
        java.lang.String string11 = jSONObject.has("ext") ? jSONObject.getString("ext") : null;
        com.five_corp.ad.CreativeType creativeType = com.five_corp.ad.CreativeType.MOVIE;
        if (jSONObject.has("ct")) {
            creativeType = com.five_corp.ad.CreativeType.get(jSONObject.getInt("ct"));
        }
        com.five_corp.ad.CreativeType creativeType2 = creativeType;
        if (jSONObject.has("dmc")) {
            org.json.JSONObject jSONObject29 = jSONObject.getJSONObject("dmc");
            if (jSONObject29.has("vdm")) {
                int i54 = jSONObject29.getInt("vdm");
                int[] iArrB11 = com.five_corp.ad.e.b(2);
                int length12 = iArrB11.length;
                int i55 = 0;
                while (true) {
                    if (i55 >= length12) {
                        throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.E1, i54);
                    }
                    int i56 = iArrB11[i55];
                    if (com.five_corp.ad.e.a(i56) == i54) {
                        i6 = i56;
                        break;
                    }
                    i55++;
                }
            } else {
                i6 = 0;
            }
            gVar = new com.five_corp.ad.internal.ad.g(i6);
        } else {
            gVar = null;
        }
        java.lang.Long lValueOf3 = java.lang.Long.valueOf(j5);
        java.lang.Long lValueOf4 = java.lang.Long.valueOf(j);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i5);
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        com.five_corp.ad.internal.ad.w wVar14 = wVar3;
        arrayList13.add(wVar14);
        com.five_corp.ad.internal.ad.w wVar15 = wVar2;
        if (wVar2 != null) {
            arrayList13.add(wVar15);
        }
        if (wVar11 != 0) {
            arrayList13.add(wVar11);
        }
        com.five_corp.ad.internal.ad.w wVar16 = wVarH;
        if (wVarH != null) {
            arrayList13.add(wVar16);
        }
        com.five_corp.ad.internal.ad.w wVar17 = wVarH2;
        if (wVarH2 != null) {
            arrayList13.add(wVar17);
        }
        for (com.five_corp.ad.internal.ad.format_config.a aVar2 : arrayList9) {
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            com.five_corp.ad.internal.ad.custom_layout.d dVar = aVar2.b;
            if (dVar != null) {
                arrayList14.add(dVar);
            }
            com.five_corp.ad.internal.ad.fullscreen.j jVar4 = aVar2.c;
            if (jVar4 != null) {
                com.five_corp.ad.internal.ad.fullscreen.f fVar4 = jVar4.b.f1817a.c;
                if (fVar4 != null && (wVar9 = fVar4.c.c) != null) {
                    arrayList13.add(wVar9);
                }
                com.five_corp.ad.internal.ad.fullscreen.o oVar3 = jVar4.b.f1817a.d;
                if (oVar3 != null && (wVar8 = oVar3.c.c) != null) {
                    arrayList13.add(wVar8);
                }
                com.five_corp.ad.internal.ad.fullscreen.p pVar2 = jVar4.b.f1817a.e;
                if (pVar2 != null && (wVar7 = pVar2.c.c) != null) {
                    arrayList13.add(wVar7);
                }
                com.five_corp.ad.internal.ad.fullscreen.p pVar3 = jVar4.b.f1817a.e;
                if (pVar3 != null && (wVar6 = pVar3.d.c) != null) {
                    arrayList13.add(wVar6);
                }
                com.five_corp.ad.internal.ad.w wVar18 = jVar4.b.f1817a.f;
                if (wVar18 != null) {
                    arrayList13.add(wVar18);
                }
                com.five_corp.ad.internal.ad.w wVar19 = jVar4.b.f1817a.h;
                if (wVar19 != null) {
                    arrayList13.add(wVar19);
                }
                arrayList14.add(jVar4.b.f1817a.g);
                com.five_corp.ad.internal.ad.custom_layout.d dVar2 = jVar4.b.f1817a.i;
                if (dVar2 != null) {
                    arrayList14.add(dVar2);
                }
                com.five_corp.ad.internal.ad.fullscreen.f fVar5 = jVar4.c.f1820a.c;
                if (fVar5 != null && (wVar5 = fVar5.c.c) != null) {
                    arrayList13.add(wVar5);
                }
                com.five_corp.ad.internal.ad.fullscreen.o oVar4 = jVar4.c.f1820a.d;
                if (oVar4 != null && (wVar4 = oVar4.c.c) != null) {
                    arrayList13.add(wVar4);
                }
                com.five_corp.ad.internal.ad.w wVar20 = jVar4.c.f1820a.b;
                if (wVar20 != null) {
                    arrayList13.add(wVar20);
                }
                com.five_corp.ad.internal.ad.w wVar21 = jVar4.c.f1820a.e;
                if (wVar21 != null) {
                    arrayList13.add(wVar21);
                }
                com.five_corp.ad.internal.ad.w wVar22 = jVar4.c.f1820a.g;
                if (wVar22 != null) {
                    arrayList13.add(wVar22);
                }
                arrayList14.add(jVar4.c.f1820a.f);
                com.five_corp.ad.internal.ad.custom_layout.d dVar3 = jVar4.c.f1820a.h;
                if (dVar3 != null) {
                    arrayList14.add(dVar3);
                }
            }
            java.util.Iterator it2 = arrayList14.iterator();
            while (it2.hasNext()) {
                for (com.five_corp.ad.internal.ad.custom_layout.h hVar2 : ((com.five_corp.ad.internal.ad.custom_layout.d) it2.next()).c) {
                    com.five_corp.ad.internal.ad.w wVar23 = hVar2.f1804a.c;
                    if (wVar23 != null) {
                        arrayList13.add(wVar23);
                    }
                    com.five_corp.ad.internal.ad.custom_layout.f fVar6 = hVar2.f1804a.e;
                    if (fVar6 != null) {
                        arrayList13.addAll(fVar6.b);
                    }
                    com.five_corp.ad.internal.ad.format_config.b bVar = hVar2.f1804a.d;
                    if (bVar != null && (list2 = bVar.b) != null) {
                        arrayList13.addAll(list2);
                    }
                    com.five_corp.ad.internal.ad.custom_layout.j jVar5 = hVar2.f1804a.f;
                    if (jVar5 != null) {
                        arrayList13.add(jVar5.f1806a);
                    }
                    com.five_corp.ad.internal.ad.custom_layout.j jVar6 = hVar2.f1804a.f;
                    if (jVar6 != null) {
                        arrayList13.add(jVar6.b);
                    }
                    com.five_corp.ad.internal.ad.custom_layout.g gVar3 = hVar2.f1804a.h;
                    if (gVar3 != null) {
                        arrayList13.addAll(gVar3.f1803a);
                    }
                }
            }
        }
        return new com.five_corp.ad.internal.ad.a(string2, creativeType2, string3, lValueOf3, fVar3, lValueOf4, numValueOf, i, i2, uVar, qVar, vVar, str4, arrayList11, arrayList2, wVar14, lValueOf2, wVar15, wVar16, wVar17, mVar, string6, string7, string8, string9, string10, arrayList10, arrayList9, list, jVar3, fVarE, fVarE2, arrayList3, string11, arrayList13, gVar);
    }

    public static com.five_corp.ad.internal.C1443k b(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("ads");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(a(jSONArray.getJSONObject(i)));
            }
            return new com.five_corp.ad.internal.C1443k(arrayList, jSONObject.has("ss") ? b(jSONObject.getJSONArray("ss")) : null, g(jSONObject.getJSONObject("mcfg")), a(jSONObject.getJSONArray("cc")));
        } catch (java.lang.NullPointerException e) {
            throw new org.json.JSONException(e.getMessage());
        }
    }

    public static com.five_corp.ad.internal.util.f c(java.lang.String str) {
        try {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(str, 0), java.nio.charset.StandardCharsets.UTF_8));
                return new com.five_corp.ad.internal.util.f(true, null, new com.five_corp.ad.internal.ad.c(jSONObject.getString("sl"), jSONObject.getString("ld"), a(jSONObject.getJSONObject("ad"))));
            } catch (com.five_corp.ad.internal.exception.b e) {
                return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(e.f1899a, "Input: " + str, e, null), null);
            } catch (org.json.JSONException e2) {
                return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.M5, "Input: " + str, e2, null), null);
            }
        } catch (java.lang.IllegalArgumentException e3) {
            return new com.five_corp.ad.internal.util.f(false, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.L5, "Input: " + str, e3, null), null);
        }
    }

    public static com.five_corp.ad.internal.ad.custom_layout.d d(org.json.JSONObject jSONObject) throws org.json.JSONException, com.five_corp.ad.internal.exception.b {
        int i;
        org.json.JSONArray jSONArray;
        int i2;
        int i3;
        com.five_corp.ad.internal.ad.custom_layout.e eVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i4;
        org.json.JSONObject jSONObject2 = jSONObject;
        int i5 = jSONObject2.getInt("w");
        int i6 = jSONObject2.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS);
        org.json.JSONArray jSONArray2 = jSONObject2.getJSONArray("ls");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i7 = 0;
        while (true) {
            java.lang.String str = "cn";
            if (i7 >= jSONArray2.length()) {
                int i8 = i5;
                int i9 = i6;
                org.json.JSONArray jSONArray3 = jSONObject2.getJSONArray("cs");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                int i10 = 0;
                while (i10 < jSONArray3.length()) {
                    org.json.JSONObject jSONObject3 = jSONArray3.getJSONObject(i10);
                    int i11 = jSONObject3.getInt("t");
                    int[] iArrB = com.five_corp.ad.e.b(9);
                    int length = iArrB.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.d1, i11);
                        }
                        i = iArrB[i12];
                        jSONArray = jSONArray3;
                        if (com.five_corp.ad.e.a(i) != i11) {
                            i12++;
                            jSONArray3 = jSONArray;
                        }
                    }
                    arrayList4.add(new com.five_corp.ad.internal.ad.custom_layout.a(i, jSONObject3.getInt("x"), jSONObject3.getInt("y"), jSONObject3.getInt("z"), jSONObject3.getInt("w"), jSONObject3.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS), jSONObject3.has("cn") ? c(jSONObject3.getJSONObject("cn")) : null, jSONObject3.has("url") ? jSONObject3.getString("url") : null));
                    i10++;
                    jSONArray3 = jSONArray;
                }
                return new com.five_corp.ad.internal.ad.custom_layout.d(i8, i9, arrayList3, arrayList4);
            }
            org.json.JSONObject jSONObject4 = jSONArray2.getJSONObject(i7);
            org.json.JSONArray jSONArray4 = jSONArray2;
            org.json.JSONObject jSONObject5 = jSONObject4.getJSONObject("o");
            int i13 = jSONObject5.getInt("o");
            int i14 = i5;
            int[] iArrB2 = com.five_corp.ad.e.b(9);
            int i15 = i6;
            int length2 = iArrB2.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length2) {
                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.e1, i13);
                }
                i2 = iArrB2[i16];
                int[] iArr = iArrB2;
                if (com.five_corp.ad.internal.ad.custom_layout.l.a(i2) != i13) {
                    i16++;
                    str = str;
                    iArrB2 = iArr;
                }
            }
            int iA = com.five_corp.ad.e.a(i2);
            int i17 = i7;
            java.util.ArrayList arrayList5 = arrayList3;
            java.lang.String str2 = str;
            switch (iA) {
                case 0:
                    org.json.JSONObject jSONObject6 = jSONObject5.getJSONObject("t");
                    java.lang.String string = jSONObject6.getString("t");
                    java.lang.String string2 = jSONObject6.getString("c");
                    java.lang.String string3 = jSONObject6.getString("bg");
                    if (jSONObject6.has("g")) {
                        int i18 = jSONObject6.getInt("g");
                        int[] iArrB3 = com.five_corp.ad.e.b(3);
                        int length3 = iArrB3.length;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= length3) {
                                throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.h1, i18);
                            }
                            int i20 = iArrB3[i19];
                            if (com.five_corp.ad.internal.ad.custom_layout.m.a(i20) == i18) {
                                i3 = i20;
                            } else {
                                i19++;
                            }
                        }
                    } else {
                        i3 = 0;
                    }
                    eVar = new com.five_corp.ad.internal.ad.custom_layout.e(1, new com.five_corp.ad.internal.ad.custom_layout.k(string, string2, string3, i3, jSONObject6.has("f") ? java.lang.Boolean.valueOf(jSONObject6.getBoolean("f")) : null, jSONObject6.has("bf") ? java.lang.Boolean.valueOf(jSONObject6.getBoolean("bf")) : null, jSONObject6.has(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS) ? java.lang.Integer.valueOf(jSONObject6.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS)) : null, jSONObject6.has("tvshackhs") ? java.lang.Integer.valueOf(jSONObject6.getInt("tvshackhs")) : null), null, null, null, null, null, null);
                    break;
                case 1:
                    eVar = new com.five_corp.ad.internal.ad.custom_layout.e(2, null, h(jSONObject5.getJSONObject(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)), null, null, null, null, null);
                    break;
                case 2:
                    jSONObject5.getJSONObject("m");
                    eVar = new com.five_corp.ad.internal.ad.custom_layout.e(3, null, null, null, null, null, null, null);
                    break;
                case 3:
                    org.json.JSONObject jSONObject7 = jSONObject5.getJSONObject(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS);
                    int i21 = jSONObject7.getInt("w");
                    jSONObject7.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS);
                    if (jSONObject7.has(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ)) {
                        org.json.JSONArray jSONArray5 = jSONObject7.getJSONArray(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                        arrayList = new java.util.ArrayList();
                        for (int i22 = 0; i22 < jSONArray5.length(); i22++) {
                            arrayList.add(h(jSONArray5.getJSONObject(i22)));
                        }
                    } else {
                        arrayList = null;
                    }
                    eVar = new com.five_corp.ad.internal.ad.custom_layout.e(4, null, null, new com.five_corp.ad.internal.ad.format_config.b(i21, arrayList, jSONObject7.getString(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS)), null, null, null, null);
                    break;
                case 4:
                    org.json.JSONObject jSONObject8 = jSONObject5.getJSONObject(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
                    boolean z = jSONObject8.getBoolean(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                    org.json.JSONArray jSONArray6 = jSONObject8.getJSONArray("is");
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    for (int i23 = 0; i23 < jSONArray6.length(); i23++) {
                        arrayList6.add(h(jSONArray6.getJSONObject(i23)));
                    }
                    eVar = new com.five_corp.ad.internal.ad.custom_layout.e(5, null, null, null, new com.five_corp.ad.internal.ad.custom_layout.f(z, arrayList6, jSONObject8.getInt("ms")), null, null, null);
                    break;
                case 5:
                    org.json.JSONObject jSONObject9 = jSONObject5.getJSONObject(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P);
                    eVar = new com.five_corp.ad.internal.ad.custom_layout.e(6, null, null, null, null, new com.five_corp.ad.internal.ad.custom_layout.j(h(jSONObject9.getJSONObject("f")), h(jSONObject9.getJSONObject("b"))), null, null);
                    break;
                case 6:
                    org.json.JSONObject jSONObject10 = jSONObject5.getJSONObject("c");
                    eVar = new com.five_corp.ad.internal.ad.custom_layout.e(7, null, null, null, null, null, new com.five_corp.ad.internal.ad.custom_layout.i(jSONObject10.getString("cc"), jSONObject10.getString("bc"), jSONObject10.getString("pc"), jSONObject10.getString("fc")), null);
                    break;
                case 7:
                    org.json.JSONObject jSONObject11 = jSONObject5.getJSONObject("cs");
                    org.json.JSONArray jSONArray7 = jSONObject11.getJSONArray("is");
                    if (jSONArray7 == null) {
                        arrayList2 = new java.util.ArrayList();
                    } else {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        for (int i24 = 0; i24 < jSONArray7.length(); i24++) {
                            arrayList7.add(h(jSONArray7.getJSONObject(i24)));
                        }
                        arrayList2 = arrayList7;
                    }
                    eVar = new com.five_corp.ad.internal.ad.custom_layout.e(8, null, null, null, null, null, null, new com.five_corp.ad.internal.ad.custom_layout.g(arrayList2, jSONObject11.has("bg") ? jSONObject11.getString("bg") : null));
                    break;
                case 8:
                    eVar = new com.five_corp.ad.internal.ad.custom_layout.e(9, null, null, null, null, null, null, null);
                    break;
                default:
                    throw new com.five_corp.ad.internal.exception.b(com.five_corp.ad.internal.t.A3, null);
            }
            com.five_corp.ad.internal.ad.custom_layout.e eVar2 = eVar;
            int i25 = jSONObject4.getInt("x");
            int i26 = jSONObject4.getInt("y");
            int i27 = jSONObject4.getInt("z");
            int i28 = jSONObject4.getInt("w");
            int i29 = jSONObject4.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS);
            com.five_corp.ad.internal.ad.custom_layout.c cVarC = jSONObject4.has(str2) ? c(jSONObject4.getJSONObject(str2)) : null;
            if (jSONObject4.has("ob")) {
                int i30 = jSONObject4.getInt("ob");
                int[] iArrB4 = com.five_corp.ad.e.b(4);
                int length4 = iArrB4.length;
                int i31 = 0;
                while (true) {
                    if (i31 >= length4) {
                        throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.y1, i30);
                    }
                    int i32 = iArrB4[i31];
                    if (com.five_corp.ad.e.a(i32) == i30) {
                        i4 = i32;
                        break;
                    }
                    i31++;
                }
            } else {
                i4 = 0;
            }
            arrayList3 = arrayList5;
            arrayList3.add(new com.five_corp.ad.internal.ad.custom_layout.h(eVar2, i25, i26, i27, i28, i29, cVarC, i4));
            i7 = i17 + 1;
            jSONObject2 = jSONObject;
            jSONArray2 = jSONArray4;
            i5 = i14;
            i6 = i15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public static com.five_corp.ad.internal.ad.beacon.f e(org.json.JSONObject jSONObject) throws org.json.JSONException, com.five_corp.ad.internal.exception.a {
        int i = jSONObject.getInt("t");
        for (int i2 : com.five_corp.ad.e.b(21)) {
            if (com.five_corp.ad.internal.ad.beacon.b.a(i2) == i) {
                com.five_corp.ad.internal.ad.beacon.a aVarB = jSONObject.has("c") ? b(jSONObject.getJSONObject("c")) : null;
                ?? EmptyList = java.util.Collections.emptyList();
                if (jSONObject.has(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P)) {
                    org.json.JSONArray jSONArray = jSONObject.getJSONArray(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P);
                    EmptyList = new java.util.ArrayList();
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                        EmptyList.add(new com.five_corp.ad.internal.ad.beacon.g(jSONObject2.getString("k"), jSONObject2.getString("v")));
                    }
                }
                return new com.five_corp.ad.internal.ad.beacon.f(i2, aVarB, EmptyList);
            }
        }
        throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.l1, i);
    }

    public static com.five_corp.ad.internal.ad.fullscreen.a f(org.json.JSONObject jSONObject) throws org.json.JSONException, com.five_corp.ad.internal.exception.a {
        com.five_corp.ad.internal.ad.fullscreen.e eVar;
        int i = jSONObject.getInt("t");
        for (int i2 : com.five_corp.ad.e.b(2)) {
            if (com.five_corp.ad.internal.ad.fullscreen.b.a(i2) == i) {
                if (jSONObject.has("tx")) {
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("tx");
                    eVar = new com.five_corp.ad.internal.ad.fullscreen.e(jSONObject2.getString("bg"), jSONObject2.getString("t"), jSONObject2.getString("tc"));
                } else {
                    eVar = null;
                }
                return new com.five_corp.ad.internal.ad.fullscreen.a(i2, eVar, jSONObject.has("iu") ? h(jSONObject.getJSONObject("iu")) : null);
            }
        }
        throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.S0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    public static com.five_corp.ad.internal.media_config.a g(org.json.JSONObject jSONObject) throws org.json.JSONException, com.five_corp.ad.internal.exception.a {
        ?? arrayList;
        int i;
        java.lang.String string = jSONObject.toString();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("ds");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        ?? r4 = 0;
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            ?? jSONObject2 = jSONArray.getJSONObject(i2);
            java.lang.String string2 = jSONObject2.getString(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
            boolean zOptBoolean = jSONObject2.optBoolean("chk");
            boolean zOptBoolean2 = jSONObject2.optBoolean("alna", r4);
            double dOptDouble = jSONObject2.optDouble("nd", 0.0d);
            int iOptInt = jSONObject2.optInt("dss", r4);
            int[] iArrB = com.five_corp.ad.e.b(4);
            int length = iArrB.length;
            ?? r15 = r4;
            while (true) {
                if (r15 >= length) {
                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.C0, iOptInt);
                }
                i = iArrB[r15];
                if (com.five_corp.ad.e.a(i) == iOptInt) {
                    break;
                }
                r15++;
            }
            arrayList2.add(new com.five_corp.ad.internal.media_config.c(string2, zOptBoolean, zOptBoolean2, dOptDouble, i, jSONObject2.optDouble("adcv", 0.01d), jSONObject2.optBoolean("afov", false)));
            i2++;
            r4 = 0;
        }
        boolean z = jSONObject.getBoolean("sn");
        ?? r6 = jSONObject.has("rmcl") ? jSONObject.getBoolean("rmcl") : r4;
        int i3 = jSONObject.has("pcdb") ? jSONObject.getInt("pcdb") : 250000;
        long j = jSONObject.has("arnims") ? jSONObject.getLong("arnims") : 1800000L;
        ?? r10 = jSONObject.has("dovd") ? jSONObject.getBoolean("dovd") : r4;
        ?? r11 = jSONObject.has("rdy") ? jSONObject.getBoolean("rdy") : r4;
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (jSONObject.has("nsdcs")) {
            ?? jSONArray2 = jSONObject.getJSONArray("nsdcs");
            arrayList = new java.util.ArrayList();
            for (?? r13 = r4; r13 < jSONArray2.length(); r13++) {
                arrayList.add(java.lang.Integer.valueOf(jSONArray2.getInt(r13)));
            }
        } else {
            arrayList = listEmptyList;
        }
        com.five_corp.ad.internal.media_config.b bVar = new com.five_corp.ad.internal.media_config.b(null, null, null);
        if (jSONObject.has("sdms")) {
            org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("sdms");
            bVar = new com.five_corp.ad.internal.media_config.b(jSONObject3.has("adchk") ? jSONObject3.getString("adchk") : null, jSONObject3.has("bc") ? jSONObject3.getString("bc") : null, jSONObject3.has("errbc") ? jSONObject3.getString("errbc") : null);
        }
        com.five_corp.ad.internal.media_config.b bVar2 = bVar;
        if (jSONObject.has("rloglv")) {
            int i4 = jSONObject.getInt("rloglv");
            for (int i5 : com.five_corp.ad.e.b(6)) {
                if (com.five_corp.ad.e.a(i5) != i4) {
                }
            }
            throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.H1, i4);
        }
        return new com.five_corp.ad.internal.media_config.a(string, arrayList2, z, r6, i3, j, r10, r11, arrayList, bVar2);
    }

    public static com.five_corp.ad.internal.ad.w h(org.json.JSONObject jSONObject) {
        return new com.five_corp.ad.internal.ad.w(jSONObject.getString("u"), jSONObject.has(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT) ? jSONObject.getString(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT) : null, jSONObject.has("rw") ? jSONObject.getInt("rw") : 0, jSONObject.has("rh") ? jSONObject.getInt("rh") : 0);
    }

    public static com.five_corp.ad.internal.ad.beacon.a b(org.json.JSONObject jSONObject) throws org.json.JSONException, com.five_corp.ad.internal.exception.a {
        int i = jSONObject.getInt("clkt");
        int i2 = 0;
        for (int i3 : com.five_corp.ad.e.b(2)) {
            if (com.five_corp.ad.internal.ad.beacon.c.a(i3) == i) {
                int i4 = jSONObject.getInt("str");
                for (int i5 : com.five_corp.ad.e.b(3)) {
                    if (com.five_corp.ad.internal.ad.beacon.h.a(i5) == i4) {
                        long j = jSONObject.getLong("tms");
                        com.five_corp.ad.internal.ad.beacon.j jVar = com.five_corp.ad.internal.ad.beacon.j.d;
                        int i6 = jVar.f1796a;
                        if (jSONObject.has("vct")) {
                            int i7 = jSONObject.getInt("vct");
                            int[] iArrB = com.five_corp.ad.e.b(2);
                            int length = iArrB.length;
                            while (true) {
                                if (i2 >= length) {
                                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.D1, i7);
                                }
                                int i8 = iArrB[i2];
                                if (com.five_corp.ad.internal.ad.beacon.i.a(i8) == i7) {
                                    i6 = i8;
                                    break;
                                }
                                i2++;
                            }
                        }
                        double d = jVar.b;
                        if (jSONObject.has("ar")) {
                            d = jSONObject.getDouble("ar");
                        }
                        return new com.five_corp.ad.internal.ad.beacon.a(i3, i5, j, new com.five_corp.ad.internal.ad.beacon.j(i6, d));
                    }
                }
                throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.a1, i4);
            }
        }
        throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.p1, i);
    }

    public static com.five_corp.ad.internal.ad.custom_layout.c c(org.json.JSONObject jSONObject) throws org.json.JSONException, com.five_corp.ad.internal.exception.a {
        int i;
        int i2 = 1;
        com.five_corp.ad.internal.ad.custom_layout.n nVar = new com.five_corp.ad.internal.ad.custom_layout.n(1, null, null);
        if (jSONObject.has("tr")) {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("tr");
            int i3 = jSONObject2.getInt("t");
            int[] iArrB = com.five_corp.ad.e.b(5);
            int length = iArrB.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.i1, i3);
                }
                int i5 = iArrB[i4];
                if (com.five_corp.ad.internal.ad.custom_layout.o.a(i5) == i3) {
                    nVar = new com.five_corp.ad.internal.ad.custom_layout.n(i5, jSONObject2.has(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS) ? java.lang.Integer.valueOf(jSONObject2.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS)) : null, jSONObject2.has("e") ? java.lang.Integer.valueOf(jSONObject2.getInt("e")) : null);
                    break;
                }
                i4++;
            }
        }
        if (jSONObject.has("sn")) {
            int i6 = jSONObject.getInt("sn");
            int[] iArrB2 = com.five_corp.ad.e.b(3);
            int length2 = iArrB2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length2) {
                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.f1, i6);
                }
                i = iArrB2[i7];
                if (com.five_corp.ad.e.a(i) == i6) {
                    break;
                }
                i7++;
            }
        } else {
            i = 1;
        }
        if (jSONObject.has("ps")) {
            int i8 = jSONObject.getInt("ps");
            for (int i9 : com.five_corp.ad.e.b(3)) {
                if (com.five_corp.ad.e.a(i9) == i8) {
                    i2 = i9;
                }
            }
            throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.g1, i8);
        }
        return new com.five_corp.ad.internal.ad.custom_layout.c(nVar, i, i2);
    }

    public static java.util.HashMap b(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.HashMap map = new java.util.HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
            java.lang.String string = jSONObject.getString(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
            org.json.JSONArray jSONArray2 = jSONObject.getJSONArray(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                org.json.JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                arrayList.add(new com.five_corp.ad.internal.ad.b(new com.five_corp.ad.internal.ad.f(jSONObject2.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY), jSONObject2.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO), jSONObject2.getInt("c")), jSONObject2.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS)));
            }
            map.put(string, arrayList);
        }
        return map;
    }

    public static com.five_corp.ad.internal.ad_check.a a(java.lang.String str) throws org.json.JSONException, com.five_corp.ad.internal.exception.a {
        int i;
        com.five_corp.ad.internal.ad_check.e eVar;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        int i2 = jSONObject.getInt("t");
        for (int i3 : com.five_corp.ad.e.b(3)) {
            if (com.five_corp.ad.internal.ad_check.d.a(i3) == i2) {
                int iA = com.five_corp.ad.e.a(i3);
                if (iA == 0) {
                    return new com.five_corp.ad.internal.ad_check.a(1, null);
                }
                if (iA == 1) {
                    return new com.five_corp.ad.internal.ad_check.a(2, null);
                }
                if (iA != 2) {
                    com.five_corp.ad.internal.ad_check.d.b(i3);
                    return null;
                }
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("lad");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                    int i5 = jSONObject2.getInt("t");
                    int[] iArrB = com.five_corp.ad.e.b(2);
                    int length = iArrB.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.x1, i5);
                        }
                        i = iArrB[i6];
                        if (com.five_corp.ad.internal.ad_check.f.a(i) == i5) {
                            break;
                        }
                        i6++;
                    }
                    int iA2 = com.five_corp.ad.e.a(i);
                    if (iA2 == 0) {
                        eVar = new com.five_corp.ad.internal.ad_check.e(1, a(jSONObject2.getJSONObject("ad")), null);
                    } else if (iA2 != 1) {
                        com.five_corp.ad.internal.ad_check.f.b(i);
                        eVar = null;
                    } else {
                        eVar = new com.five_corp.ad.internal.ad_check.e(2, null, jSONObject2.getJSONObject("coad").getString("ots"));
                    }
                    arrayList.add(eVar);
                }
                return new com.five_corp.ad.internal.ad_check.a(3, arrayList);
            }
        }
        throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.k1, i2);
    }

    public static java.util.ArrayList a(org.json.JSONArray jSONArray) throws org.json.JSONException, com.five_corp.ad.internal.exception.a {
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i2);
            int i3 = jSONObject.getInt("t");
            int[] iArrB = com.five_corp.ad.e.b(3);
            int length = iArrB.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    throw new com.five_corp.ad.internal.exception.a(com.five_corp.ad.internal.t.s1, i3);
                }
                i = iArrB[i4];
                if (com.five_corp.ad.e.a(i) == i3) {
                    break;
                }
                i4++;
            }
            arrayList.add(new com.five_corp.ad.internal.ad.e(i, new com.five_corp.ad.internal.ad.f(jSONObject.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY), jSONObject.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO), jSONObject.getInt("c")), jSONObject.has("npt") ? java.lang.Long.valueOf(jSONObject.getLong("npt")) : null));
        }
        return arrayList;
    }
}
