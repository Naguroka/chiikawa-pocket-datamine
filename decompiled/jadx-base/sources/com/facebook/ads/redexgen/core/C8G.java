package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8G {
    public static java.util.concurrent.atomic.AtomicInteger A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"Y", "xyQF3sxjnp2qUSvJDNu5P0iyyc584Vpd", "idh0g523ELVLwEFfu1u5qrhcL3DPrNZC", "UJ0fDp2QsgF1WBSdDofKnf2EwbpjWzp9", "LsjKEz1u6vy", "QA8fX7ramcT9ifSsWPTVo7ChqvJDDBqT", "HHR99srKdCFKOrgMnrhL9AMY8z42dkOr", "PWBGS5sCKwM35N3BbQj09sXNColJxvDn"};
    public static final java.lang.Object A03;
    public static final java.lang.String A04;
    public static final java.util.Map<java.lang.String, java.lang.Integer> A05;
    public static final java.util.Set<java.lang.String> A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C8I A01(java.lang.String str, com.facebook.ads.redexgen.core.C7j c7j, java.util.Map<java.lang.String, java.lang.String> map) {
        com.facebook.ads.redexgen.core.C8I c8i = null;
        try {
            c8i = new com.facebook.ads.redexgen.core.C8I(c7j.A08().A01(), c7j.A08().A02(), new com.facebook.ads.redexgen.core.AnonymousClass82(str, map, true).A02());
            A0C(c8i, c7j);
            return c8i;
        } catch (java.lang.Exception unused) {
            return c8i;
        }
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static org.json.JSONArray A04(com.facebook.ads.redexgen.core.C7j c7j, int i) {
        com.facebook.ads.redexgen.core.C8D c8dA07;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        synchronized (A03) {
            java.io.FileInputStream fileInputStreamOpenFileInput = null;
            java.io.InputStreamReader inputStreamReader = null;
            java.io.BufferedReader bufferedReader = null;
            try {
                try {
                    if (new java.io.File(c7j.getFilesDir(), com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j)).exists()) {
                        fileInputStreamOpenFileInput = c7j.openFileInput(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j));
                        inputStreamReader = new java.io.InputStreamReader(fileInputStreamOpenFileInput);
                        bufferedReader = new java.io.BufferedReader(inputStreamReader);
                        while (true) {
                            java.lang.String line = bufferedReader.readLine();
                            if (line == null || i == 0) {
                                break;
                            }
                            org.json.JSONObject jSONObject = new org.json.JSONObject(line);
                            if (!jSONObject.has(A02(260, 7, 82))) {
                                jSONObject.put(A02(260, 7, 82), java.lang.String.valueOf(0));
                            }
                            java.lang.String string = jSONObject.getString(A02(343, 2, 110));
                            if (!A06.contains(string)) {
                                int i2 = jSONObject.getInt(A02(260, 7, 82));
                                if (A05.containsKey(string)) {
                                    jSONObject.put(A02(260, 7, 82), java.lang.String.valueOf(A05.get(string)));
                                } else {
                                    A0E(string, i2);
                                }
                                jSONArray.put(jSONObject);
                                if (i > 0) {
                                    i--;
                                }
                            }
                        }
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (java.io.IOException e) {
                            e = e;
                            c8dA07 = c7j.A07();
                            c8dA07.A3y(e);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                } catch (java.io.IOException | org.json.JSONException e2) {
                    c7j.A07().A3y(e2);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (java.io.IOException e3) {
                            e = e3;
                            c8dA07 = c7j.A07();
                            c8dA07.A3y(e);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
            } catch (java.lang.Throwable th) {
                if (0 != 0) {
                    try {
                        bufferedReader.close();
                    } catch (java.io.IOException e4) {
                        c7j.A07().A3y(e4);
                        throw th;
                    }
                }
                if (0 != 0) {
                    inputStreamReader.close();
                }
                if (0 != 0) {
                    fileInputStreamOpenFileInput.close();
                }
                throw th;
            }
        }
        return jSONArray;
    }

    public static void A06() {
        A01 = new byte[]{-73, -24, -36, 0, 46, 43, 44, -1, 43, 49, 42, 48, 33, 46, -10, -36, -73, -43, -30, -101, -24, -108, -40, -39, -32, -39, -24, -39, -108, -40, -39, -42, -23, -37, -108, -39, -22, -39, -30, -24, -25, -108, -38, -35, -32, -39, -94, 30, 60, 73, 2, 79, -5, okio.Utf8.REPLACEMENT_BYTE, 64, 71, 64, 79, 64, -5, 65, 68, 71, 64, -4, 25, 26, 23, 42, 28, 52, 37, 39, 26, 27, -43, 6, -11, -2, 4, -45, -1, 5, -2, 4, 3, -1, -2, 50, 33, 38, 34, 43, 32, 34, 11, 34, 49, 52, 44, 47, 40, -36, 1, -2, -13, -15, -84, -16, -15, -18, 1, -13, -84, -15, 2, -15, -6, 0, -1, -84, -14, -11, -8, -15, -70, -106, -46, -11, -8, -15, -84, -1, -11, 6, -15, -58, -84, 32, 56, 54, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, 50, 49, -19, 50, 67, 50, 59, 65, 64, -5, 1, 25, 23, 30, 30, 23, 28, 21, -50, 17, 29, 32, 32, 35, 30, 34, 19, 18, -50, 18, 19, 16, 35, 21, -50, 19, 36, 19, 28, 34, -50, 26, 23, 28, 19, -36, 44, 74, 81, 65, 70, okio.Utf8.REPLACEMENT_BYTE, -8, 76, 71, -8, 77, 72, 60, 57, 76, kotlin.io.encoding.Base64.padSymbol, -8, 77, 70, 74, kotlin.io.encoding.Base64.padSymbol, 59, 71, 74, 60, kotlin.io.encoding.Base64.padSymbol, 60, -8, 60, kotlin.io.encoding.Base64.padSymbol, 58, 77, okio.Utf8.REPLACEMENT_BYTE, 36, 71, okio.Utf8.REPLACEMENT_BYTE, 29, 78, kotlin.io.encoding.Base64.padSymbol, 70, 76, 6, -8, 57, 60, 60, 65, 70, okio.Utf8.REPLACEMENT_BYTE, -8, 76, 71, -8, 39, 70, okio.Utf8.REPLACEMENT_BYTE, 71, 65, 70, okio.Utf8.REPLACEMENT_BYTE, 29, 78, kotlin.io.encoding.Base64.padSymbol, 70, 76, 6, 36, 57, 42, 50, 53, 29, 48, 48, 33, 41, 44, 48, -13, -16, 3, -16, -45, -44, -50, -37, -34, -42, -42, -40, -35, -42, -23, -22, -25, -6, -20, -15, -12, -20, -8, 34, 37, 42, 37, 47, 36, 33, 32, -36, 33, 50, 33, 42, 48, -36, 47, 36, 43, 49, 40, 32, -36, 42, 43, 48, -36, 30, 33, -36, 49, 44, 32, 29, 48, 33, 32, -36, 48, 43, -36, 11, 42, 35, 43, 37, 42, 35, 1, 50, 33, 42, 48, -22, 65, 60, -7, -21, -7, -7, -17, -11, -12, -27, -17, -22, -13, -27, -13, -13, -23, -17, -18, -33, -12, -23, -19, -27, 49, 41, 39, 46, 46, 35, 34, 3, 52, 35, 44, 50, 49, -34, -5, -34, -34, -32, -51, -33, -28, -37, -48, 19, 21, 2, 20, 25, 16, 5, -1, 3, 15, 4, 5, 70, 59, okio.Utf8.REPLACEMENT_BYTE, 55, 74, 79, 70, 59};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0G(com.facebook.ads.redexgen.core.C7j c7j) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        synchronized (A03) {
            int i = 0;
            java.io.FileInputStream fileInputStreamOpenFileInput = null;
            java.io.InputStreamReader inputStreamReader = null;
            java.io.BufferedReader bufferedReader = null;
            java.io.FileOutputStream fileOutputStreamOpenFileOutput = null;
            try {
                try {
                    try {
                        if (new java.io.File(c7j.getFilesDir(), com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j)).exists()) {
                            fileInputStreamOpenFileInput = c7j.openFileInput(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j));
                            inputStreamReader = new java.io.InputStreamReader(fileInputStreamOpenFileInput);
                            bufferedReader = new java.io.BufferedReader(inputStreamReader);
                            while (true) {
                                java.lang.String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                org.json.JSONObject jSONObject = new org.json.JSONObject(line);
                                java.lang.String string = jSONObject.getString(A02(343, 2, 110));
                                if (!A06.contains(string)) {
                                    if (A05.containsKey(string)) {
                                        java.lang.Integer num = A05.get(string);
                                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
                                        int iA02 = com.facebook.ads.redexgen.core.Io.A02(c7j);
                                        if (iA02 <= -1 || numValueOf.intValue() <= iA02 - 1) {
                                            jSONObject.put(A02(260, 7, 82), java.lang.String.valueOf(numValueOf));
                                            jSONArray.put(jSONObject);
                                        } else {
                                            A0D(string);
                                            i++;
                                        }
                                    } else {
                                        jSONArray.put(jSONObject);
                                    }
                                }
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            int length = jSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                sb.append(jSONArray.getJSONObject(i2).toString()).append('\n');
                            }
                            fileOutputStreamOpenFileOutput = c7j.openFileOutput(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j), 0);
                            fileOutputStreamOpenFileOutput.write(sb.toString().getBytes());
                        }
                        A09(c7j, A00(c7j));
                        if (i > 0) {
                            c7j.A07().AA0(A02(271, 10, 5), com.facebook.ads.redexgen.core.C8E.A2Y, new com.facebook.ads.redexgen.core.C8F(A02(138, 15, 99), A02(367, 16, 84) + i));
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException e) {
                                c7j.A07().A3y(e);
                            }
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                        A06.clear();
                        A05.clear();
                        return true;
                    } catch (java.lang.Throwable th) {
                        if (0 != 0) {
                            try {
                                bufferedReader.close();
                            } catch (java.io.IOException e2) {
                                c7j.A07().A3y(e2);
                                A06.clear();
                                A05.clear();
                                throw th;
                            }
                        }
                        if (0 != 0) {
                            inputStreamReader.close();
                        }
                        if (0 != 0) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (0 != 0) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                        A06.clear();
                        A05.clear();
                        throw th;
                    }
                } catch (java.io.IOException | org.json.JSONException e3) {
                    c7j.A07().A3y(e3);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (java.io.IOException e4) {
                            c7j.A07().A3y(e4);
                            A06.clear();
                            A05.clear();
                            return false;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    A06.clear();
                    A05.clear();
                    return false;
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0229 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x022e A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0233 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0238 A[Catch: IOException -> 0x0241, all -> 0x0254, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x023d A[Catch: IOException -> 0x0241, all -> 0x0254, TRY_LEAVE, TryCatch #8 {IOException -> 0x0241, blocks: (B:115:0x0224, B:117:0x0229, B:119:0x022e, B:121:0x0233, B:123:0x0238, B:125:0x023d), top: B:139:0x0224, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x005d A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0H(com.facebook.ads.redexgen.core.C7j c7j) {
        int iIntValue;
        synchronized (A03) {
            int i = 0;
            java.io.FileInputStream fileInputStreamOpenFileInput = null;
            java.io.InputStreamReader inputStreamReader = null;
            java.io.BufferedReader bufferedReader = null;
            java.io.FileOutputStream fileOutputStreamOpenFileOutput = null;
            java.io.FileInputStream fileInputStreamOpenFileInput2 = null;
            java.io.FileOutputStream fileOutputStreamOpenFileOutput2 = null;
            try {
                try {
                    java.lang.String processSpecificName = com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j);
                    java.io.File file = new java.io.File(c7j.getFilesDir(), processSpecificName);
                    java.lang.String str = processSpecificName + A02(255, 5, 91);
                    A0A(c7j, str);
                    if (file.exists()) {
                        fileOutputStreamOpenFileOutput2 = c7j.openFileOutput(str, 32768);
                        fileInputStreamOpenFileInput = c7j.openFileInput(processSpecificName);
                        try {
                            inputStreamReader = new java.io.InputStreamReader(fileInputStreamOpenFileInput);
                            try {
                                bufferedReader = new java.io.BufferedReader(inputStreamReader);
                                while (true) {
                                    try {
                                        java.lang.String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        try {
                                            org.json.JSONObject jSONObject = new org.json.JSONObject(line);
                                            java.lang.String string = jSONObject.getString(A02(343, 2, 110));
                                            if (!A06.contains(string)) {
                                                if (A05.containsKey(string)) {
                                                    try {
                                                        java.lang.Integer num = A05.get(string);
                                                        if (num != null) {
                                                            try {
                                                                iIntValue = num.intValue();
                                                            } catch (java.io.IOException e) {
                                                                e = e;
                                                            } catch (org.json.JSONException e2) {
                                                                e = e2;
                                                                if (c7j.A04().A9O()) {
                                                                    android.util.Log.e(A04, A02(153, 36, 68), e);
                                                                }
                                                            } catch (java.lang.Throwable th) {
                                                                th = th;
                                                                if (bufferedReader != null) {
                                                                    try {
                                                                        bufferedReader.close();
                                                                    } catch (java.io.IOException e3) {
                                                                        c7j.A07().A3y(e3);
                                                                        A06.clear();
                                                                        A05.clear();
                                                                        throw th;
                                                                    }
                                                                }
                                                                if (inputStreamReader != null) {
                                                                    inputStreamReader.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput != null) {
                                                                    fileInputStreamOpenFileInput.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput != null) {
                                                                    fileOutputStreamOpenFileOutput.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput2 != null) {
                                                                    fileInputStreamOpenFileInput2.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput2 != null) {
                                                                    fileOutputStreamOpenFileOutput2.close();
                                                                }
                                                                A06.clear();
                                                                A05.clear();
                                                                throw th;
                                                            }
                                                        } else {
                                                            iIntValue = 0;
                                                        }
                                                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iIntValue);
                                                        int iA02 = com.facebook.ads.redexgen.core.Io.A02(c7j);
                                                        if (iA02 > -1) {
                                                            try {
                                                                if (numValueOf.intValue() > iA02 - 1) {
                                                                    try {
                                                                        try {
                                                                            A0D(string);
                                                                            i++;
                                                                        } catch (org.json.JSONException e4) {
                                                                            e = e4;
                                                                            if (c7j.A04().A9O()) {
                                                                                android.util.Log.e(A04, A02(153, 36, 68), e);
                                                                            }
                                                                        }
                                                                    } catch (java.io.IOException e5) {
                                                                        e = e5;
                                                                    } catch (java.lang.Throwable th2) {
                                                                        th = th2;
                                                                        if (bufferedReader != null) {
                                                                            bufferedReader.close();
                                                                        }
                                                                        if (inputStreamReader != null) {
                                                                            inputStreamReader.close();
                                                                        }
                                                                        if (fileInputStreamOpenFileInput != null) {
                                                                            fileInputStreamOpenFileInput.close();
                                                                        }
                                                                        if (fileOutputStreamOpenFileOutput != null) {
                                                                            fileOutputStreamOpenFileOutput.close();
                                                                        }
                                                                        if (fileInputStreamOpenFileInput2 != null) {
                                                                            fileInputStreamOpenFileInput2.close();
                                                                        }
                                                                        if (fileOutputStreamOpenFileOutput2 != null) {
                                                                            fileOutputStreamOpenFileOutput2.close();
                                                                        }
                                                                        A06.clear();
                                                                        A05.clear();
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (java.io.IOException e6) {
                                                                e = e6;
                                                            } catch (org.json.JSONException e7) {
                                                                e = e7;
                                                            } catch (java.lang.Throwable th3) {
                                                                th = th3;
                                                                if (bufferedReader != null) {
                                                                    bufferedReader.close();
                                                                }
                                                                if (inputStreamReader != null) {
                                                                    inputStreamReader.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput != null) {
                                                                    fileInputStreamOpenFileInput.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput != null) {
                                                                    fileOutputStreamOpenFileOutput.close();
                                                                }
                                                                if (fileInputStreamOpenFileInput2 != null) {
                                                                    fileInputStreamOpenFileInput2.close();
                                                                }
                                                                if (fileOutputStreamOpenFileOutput2 != null) {
                                                                    fileOutputStreamOpenFileOutput2.close();
                                                                }
                                                                A06.clear();
                                                                A05.clear();
                                                                throw th;
                                                            }
                                                        }
                                                        jSONObject.put(A02(260, 7, 82), java.lang.String.valueOf(numValueOf));
                                                        fileOutputStreamOpenFileOutput2.write((jSONObject.toString() + '\n').getBytes());
                                                    } catch (java.io.IOException e8) {
                                                        e = e8;
                                                    } catch (org.json.JSONException e9) {
                                                        e = e9;
                                                    } catch (java.lang.Throwable th4) {
                                                        th = th4;
                                                    }
                                                } else {
                                                    fileOutputStreamOpenFileOutput2.write((jSONObject.toString() + '\n').getBytes());
                                                }
                                            }
                                        } catch (org.json.JSONException e10) {
                                            e = e10;
                                        }
                                    } catch (java.io.IOException e11) {
                                        e = e11;
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                    }
                                    c7j.A07().A3y(e);
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (java.io.IOException e12) {
                                            c7j.A07().A3y(e12);
                                        }
                                    }
                                    if (inputStreamReader != null) {
                                        inputStreamReader.close();
                                    }
                                    if (fileInputStreamOpenFileInput != null) {
                                        fileInputStreamOpenFileInput.close();
                                    }
                                    if (fileOutputStreamOpenFileOutput != null) {
                                        fileOutputStreamOpenFileOutput.close();
                                    }
                                    if (fileInputStreamOpenFileInput2 != null) {
                                        fileInputStreamOpenFileInput2.close();
                                    }
                                    if (fileOutputStreamOpenFileOutput2 != null) {
                                        fileOutputStreamOpenFileOutput2.close();
                                    }
                                    A06.clear();
                                    A05.clear();
                                    return false;
                                }
                                fileInputStreamOpenFileInput2 = c7j.openFileInput(str);
                                fileOutputStreamOpenFileOutput = c7j.openFileOutput(processSpecificName, 0);
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i2 = fileInputStreamOpenFileInput2.read(bArr);
                                    if (i2 <= 0) {
                                        break;
                                    }
                                    fileOutputStreamOpenFileOutput.write(bArr, 0, i2);
                                }
                                fileInputStreamOpenFileInput2.close();
                                fileOutputStreamOpenFileOutput2.close();
                                A0A(c7j, str);
                            } catch (java.io.IOException e13) {
                                e = e13;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                            }
                        } catch (java.io.IOException e14) {
                            e = e14;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                        }
                    }
                    A09(c7j, A00(c7j));
                    if (i > 0) {
                        c7j.A07().AA0(A02(271, 10, 5), com.facebook.ads.redexgen.core.C8E.A2Y, new com.facebook.ads.redexgen.core.C8F(A02(138, 15, 99), A02(367, 16, 84) + i));
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (java.io.IOException e15) {
                            c7j.A07().A3y(e15);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                    if (fileInputStreamOpenFileInput2 != null) {
                        fileInputStreamOpenFileInput2.close();
                    }
                    if (fileOutputStreamOpenFileOutput2 != null) {
                        fileOutputStreamOpenFileOutput2.close();
                    }
                    A06.clear();
                    A05.clear();
                    return true;
                } catch (java.io.IOException e16) {
                    e = e16;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        }
    }

    static {
        A06();
        A04 = com.facebook.ads.redexgen.core.C8G.class.getName();
        A03 = new java.lang.Object();
        A06 = java.util.Collections.synchronizedSet(new java.util.HashSet());
        A05 = java.util.Collections.synchronizedMap(new java.util.HashMap());
        A00 = new java.util.concurrent.atomic.AtomicInteger();
    }

    public static int A00(android.content.Context context) {
        return context.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) - A06.size();
    }

    public static org.json.JSONArray A03(com.facebook.ads.redexgen.core.C7j c7j) {
        return A04(c7j, -1);
    }

    public static org.json.JSONObject A05(com.facebook.ads.redexgen.core.C8I c8i) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(A02(343, 2, 110), java.util.UUID.randomUUID().toString());
        jSONObject.put(A02(406, 4, 108), c8i.A03());
        jSONObject.put(A02(402, 4, 104), com.facebook.ads.redexgen.core.C0841Lu.A02(c8i.A01()));
        jSONObject.put(A02(355, 12, 22), com.facebook.ads.redexgen.core.C0841Lu.A02(c8i.A00()));
        jSONObject.put(A02(345, 10, 28), c8i.A02());
        jSONObject.put(A02(267, 4, 37), c8i.A04() != null ? new org.json.JSONObject(c8i.A04()) : new org.json.JSONObject());
        jSONObject.put(A02(260, 7, 82), java.lang.String.valueOf(0));
        return jSONObject;
    }

    public static void A07(android.content.Context context) {
        synchronized (A03) {
            java.io.File file = new java.io.File(context.getFilesDir(), com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), context));
            if (file.exists()) {
                file.delete();
            }
            A09(context, 0);
            A06.clear();
            A05.clear();
        }
    }

    public static void A08(android.content.Context context) {
        A09(context, context.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0).getInt(A02(75, 10, 38), 0) + 1);
    }

    public static void A09(android.content.Context context, int i) {
        int i2 = 0;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(65, 10, 107), context), 0);
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (i >= 0) {
            i2 = i;
        }
        if (A02[1].charAt(3) != 'F') {
            throw new java.lang.RuntimeException();
        }
        A02[0] = androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT;
        editorEdit.putInt(A02(75, 10, 38), i2).apply();
    }

    public static void A0A(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str) {
        java.io.File file = new java.io.File(c7j.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            c7j.A07().A3y(new java.lang.RuntimeException(A02(47, 18, 113)));
        }
    }

    public static void A0B(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, java.lang.String str) {
        java.lang.Integer num = A05.get(str);
        if (num == null) {
            if (c1198Zr.A04().A9O()) {
                android.util.Log.e(A04, A02(189, 66, 110));
            }
            num = 0;
        } else {
            A05.remove(str);
        }
        java.util.Map<java.lang.String, java.lang.Integer> map = A05;
        java.lang.Integer attempt = java.lang.Integer.valueOf(num.intValue() + 1);
        map.put(str, attempt);
    }

    public static void A0C(com.facebook.ads.redexgen.core.C8I c8i, com.facebook.ads.redexgen.core.C7j c7j) {
        if (c8i != null && c7j != null) {
            synchronized (A03) {
                try {
                    java.lang.String processSpecificName = com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A02(281, 9, 27), c7j);
                    java.io.File file = new java.io.File(c7j.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int debugLogFileSizeLimit = com.facebook.ads.redexgen.core.Io.A07(c7j);
                        long length = file.length();
                        if (debugLogFileSizeLimit > 0 && length > debugLogFileSizeLimit) {
                            boolean zDelete = file.delete();
                            A09(c7j, 0);
                            A06.clear();
                            A05.clear();
                            if (zDelete) {
                                java.util.Map<java.lang.String, java.lang.String> mapA59 = c7j.A03().A59();
                                mapA59.put(A02(383, 7, 1), A02(271, 10, 5));
                                mapA59.put(A02(390, 12, 54), java.lang.String.valueOf(com.json.mediationsdk.utils.IronSourceConstants.IS_CAP_SESSION));
                                A01(A02(102, 36, 34) + length + A02(1, 15, 82) + A00.getAndIncrement(), c7j, mapA59);
                                return;
                            }
                            java.lang.String processSpecificName2 = A02(85, 17, 83);
                            android.util.Log.e(processSpecificName2, A02(16, 31, 10));
                        }
                    }
                    org.json.JSONObject jSONObjectA05 = A05(c8i);
                    java.io.FileOutputStream outputStream = c7j.openFileOutput(processSpecificName, 32768);
                    outputStream.write((jSONObjectA05.toString() + A02(0, 1, 67)).getBytes());
                    outputStream.close();
                    A08(c7j);
                } catch (java.lang.Exception e) {
                    c7j.A07().A3y(e);
                }
            }
        }
    }

    public static void A0D(java.lang.String str) {
        A05.remove(str);
        A06.add(str);
    }

    public static void A0E(java.lang.String str, int i) {
        if (!A06.contains(str)) {
            if (A05.containsKey(str)) {
                A05.remove(str);
            }
            A05.put(str, java.lang.Integer.valueOf(i));
            return;
        }
        throw new java.lang.RuntimeException(A02(290, 53, 82));
    }

    public static boolean A0F(com.facebook.ads.redexgen.core.C7j c7j) {
        if (com.facebook.ads.redexgen.core.Io.A0O(c7j)) {
            return A0H(c7j);
        }
        return A0G(c7j);
    }

    public static boolean A0I(java.lang.String str) {
        return A06.contains(str) || A05.containsKey(str);
    }
}
