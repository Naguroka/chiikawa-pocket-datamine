package com.facebook.ads.internal.dynamicloading;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class DynamicLoaderImpl implements com.facebook.ads.internal.dynamicloading.DynamicLoader, com.facebook.ads.internal.dynamicloading.RemoteRenderingApi {
    public static com.facebook.ads.internal.api.AdSettingsApi A00;
    public static com.facebook.ads.internal.api.AudienceNetworkAdsApi A01;
    public static com.facebook.ads.internal.api.NativeAdViewApi A02;
    public static com.facebook.ads.internal.api.NativeBannerAdViewApi A03;
    public static com.facebook.ads.redexgen.core.C5Z A04;
    public static java.lang.String[] A05 = {"FC7PnIQgfKJQfBdQKCurjH6JKIFxjroV", "Ez", "t7pjhhQGIazlhmf4UkwJSh", "Iyhtqk6gC8uyo8Dul94yaDEfv0PrNxAT", "5egoyUR4tSKxNoVVXreZdHvR7BDPW4Oi", "IYlCvOKkAZQkBJEI1e2UxVPIL3gdF2Y", "0QNvsKlwTsAv0tvLZz9yZ17i9BLNPSLj", "RauEdYPLg0wTIRL3lDclFm017FzJm5su"};
    public static final com.facebook.ads.internal.api.InitApi A06 = new com.facebook.ads.internal.api.InitApi() { // from class: com.facebook.ads.redexgen.X.5d
        @Override // com.facebook.ads.internal.api.InitApi
        public final void initialize(android.content.Context context, com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper, com.facebook.ads.AudienceNetworkAds.InitListener initListener, int i) {
            com.facebook.ads.redexgen.core.C05138c.A0H(com.facebook.ads.redexgen.core.C04465b.A09(context), multithreadedBundleWrapper, initListener, i);
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final boolean isInitialized() {
            return com.facebook.ads.redexgen.core.C05138c.A0I();
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onAdLoadInvoked(android.content.Context context) {
            com.facebook.ads.redexgen.core.C05138c.A08(com.facebook.ads.redexgen.core.C04465b.A09(context));
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onContentProviderCreated(android.content.Context context) {
            com.facebook.ads.redexgen.core.C05138c.A09(com.facebook.ads.redexgen.core.C04465b.A09(context));
        }
    };

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdOptionsViewApi createAdOptionsView(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.AdOptionsView.Orientation orientation, int i, com.facebook.ads.AdOptionsView adOptionsView) {
        return new com.facebook.ads.redexgen.core.C1245ac(context, nativeAdBase, nativeAdLayout, orientation, i, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdOptionsViewApi createAdOptionsView(android.content.Context context, com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.AdOptionsView adOptionsView) {
        return new com.facebook.ads.redexgen.core.C1245ac(context, nativeAdBase, nativeAdLayout, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdSettingsApi createAdSettingsApi() {
        if (A00 == null) {
            A00 = new com.facebook.ads.internal.api.AdSettingsApi() { // from class: com.facebook.ads.redexgen.X.5O
                public static byte[] A00;
                public static java.lang.String[] A01 = {"5g08JbOH8rkW6qlmlOL6A29nsZk", "3r4qaOnTaYokldocBIi2hcDPsInD4tfb", "t1tpXM0pz4jVDPHhq8DkXYPWitYDcWj1", "M2cS8KouRYddMtKm0nW0nVVXMs", "pym3fLCD1Tj466B1DlzVQDM4sLBUPDKC", "ku7CSS8RQpD6IDBrWEnqwcDf2zEQuZtv", "vquYYtSubxB68XLpTdo3CiQszZtPPcit", "yyxMEkIlFEzZN5mv2HKHli04TbghSWGE"};
                public static final java.lang.String A02;
                public static final java.util.Collection<java.lang.String> A03;
                public static volatile boolean A04;

                public static java.lang.String A00(int i, int i2, int i3) {
                    byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
                    for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                        bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
                        java.lang.String[] strArr = A01;
                        if (strArr[7].charAt(16) == strArr[1].charAt(16)) {
                            throw new java.lang.RuntimeException();
                        }
                        A01[0] = "ed4gaD";
                    }
                    return new java.lang.String(bArrCopyOfRange);
                }

                public static void A01() {
                    A00 = new byte[]{14, 5, 23, 15, 8, 14, 3, 24, 25, 10, 21, 31, 25, 3, 21, 24, 3, 20, 29, 15, 20, 3, 23, 25, 5, 90, 107, 125, 122, 46, 99, 97, 106, 107, 46, 106, 107, 120, 103, 109, 107, 46, 102, 111, 125, 102, 52, 46, 71, 120, 117, 126, 48, 100, 117, 99, 100, 121, 126, 119, 48, 105, 127, 101, 98, 48, 113, 96, 96, 48, 103, 121, 100, 120, 48, 86, 113, 115, 117, 114, 127, 127, 123, 55, 99, 48, 113, 116, 48, 101, 126, 121, 100, 99, 48, 105, 127, 101, 48, 125, 101, 99, 100, 48, 99, 96, 117, 115, 121, 118, 105, 48, 100, 120, 117, 48, 116, 117, 102, 121, 115, 117, 48, 120, 113, 99, 120, 117, 116, 48, 89, 84, 48, 100, 127, 48, 117, 126, 99, 101, 98, 117, 48, 100, 120, 117, 48, 116, 117, 124, 121, 102, 117, 98, 105, 48, 127, 118, 48, 100, 117, 99, 100, 48, 113, 116, 99, 60, 48, 113, 116, 116, 48, 100, 120, 117, 48, 118, 127, 124, 124, 127, 103, 121, 126, 119, 48, 115, 127, 116, 117, 48, 114, 117, 118, 127, 98, 117, 48, 124, 127, 113, 116, 121, 126, 119, 48, 113, 126, 48, 113, 116, 42, 48, 81, 116, 67, 117, 100, 100, 121, 126, 119, 99, 62, 113, 116, 116, 68, 117, 99, 100, 84, 117, 102, 121, 115, 117, 56, 50, 7, 6, 21, 10, 0, 6, 42, 7, 43, 2, 16, 11, 103, 111, 111, 103, 108, 101, 95, 115, 100, 107, 126, 105, 102, 16, 4, 9, 30, 94, 80, 22, 124, 104, 101, 114, 50, 60, 126, 122};
                }

                static {
                    A01();
                    A02 = com.facebook.ads.internal.settings.AdInternalSettings.class.getSimpleName();
                    A03 = new java.util.HashSet();
                    A03.add(A00(262, 3, 66));
                    A03.add(A00(252, 10, 79));
                    A03.add(A00(265, 7, 41));
                    A03.add(A00(272, 8, 69));
                    A04 = false;
                }

                public static void A02(java.lang.String str) {
                    if (A04) {
                        return;
                    }
                    A04 = true;
                    android.util.Log.i(A02, A00(25, 23, 65) + str);
                    android.util.Log.i(A02, A00(48, 192, 95) + str + A00(0, 3, 99));
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final boolean isTestMode(android.content.Context context) {
                    if (!com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild() && !com.facebook.ads.internal.settings.AdInternalSettings.isExplicitTestMode()) {
                        java.util.Collection<java.lang.String> collection = A03;
                        java.lang.String str = android.os.Build.PRODUCT;
                        java.lang.String[] strArr = A01;
                        if (strArr[7].charAt(16) == strArr[1].charAt(16)) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A01;
                        strArr2[7] = "T4gBNxEGe37wgzXKS7GC3py1fkLao5wI";
                        strArr2[1] = "pVb2nflAxo98tm2kzzD3dq5aQ79B8LIX";
                        if (!collection.contains(str)) {
                            com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper = com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle;
                            java.lang.String strA00 = A00(3, 22, 19);
                            java.lang.String string = multithreadedBundleWrapper.getString(strA00, null);
                            if (string == null) {
                                android.content.SharedPreferences sharedPreferencesA00 = com.facebook.ads.redexgen.core.KJ.A00(context);
                                java.lang.String strA01 = A00(androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, 12, 44);
                                string = sharedPreferencesA00.getString(strA01, null);
                                if (android.text.TextUtils.isEmpty(string)) {
                                    string = java.util.UUID.randomUUID().toString();
                                    android.content.SharedPreferences.Editor editorEdit = sharedPreferencesA00.edit();
                                    java.lang.String[] strArr3 = A01;
                                    if (strArr3[7].charAt(16) != strArr3[1].charAt(16)) {
                                        A01[3] = "RjRRqTdr5YFfB1Oiza3DhfcwhE";
                                        editorEdit.putString(strA01, string).apply();
                                    } else {
                                        editorEdit.putString(strA01, string).apply();
                                    }
                                }
                                com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.putString(strA00, string);
                            }
                            if (com.facebook.ads.internal.settings.AdInternalSettings.getTestDevicesList().contains(string)) {
                                return true;
                            }
                            A02(string);
                            return false;
                        }
                    }
                    return true;
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final void turnOnDebugger() {
                    com.facebook.ads.redexgen.core.AbstractC0792Ju.A02();
                }
            };
        }
        return A00;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdSizeApi createAdSizeApi(int i) {
        final com.facebook.ads.redexgen.core.EnumC0781Jj enumC0781JjA02 = com.facebook.ads.redexgen.core.LA.A02(i);
        return new com.facebook.ads.internal.api.AdSizeApi() { // from class: com.facebook.ads.redexgen.X.8Z
            @Override // com.facebook.ads.internal.api.AdSizeApi
            public final int getHeight() {
                return enumC0781JjA02.A03();
            }

            @Override // com.facebook.ads.internal.api.AdSizeApi
            public final int getWidth() {
                return enumC0781JjA02.A04();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdViewApi createAdViewApi(android.content.Context context, java.lang.String str, com.facebook.ads.AdSize adSize, com.facebook.ads.internal.api.AdViewParentApi adViewParentApi, com.facebook.ads.AdView adView) {
        return (com.facebook.ads.internal.api.AdViewApi) com.facebook.ads.redexgen.core.C5M.A00(new com.facebook.ads.redexgen.core.C5P(context, str, adSize, adViewParentApi, adView), com.facebook.ads.internal.api.AdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AdViewApi createAdViewApi(android.content.Context context, java.lang.String str, java.lang.String str2, com.facebook.ads.internal.api.AdViewParentApi adViewParentApi, com.facebook.ads.AdView adView) throws java.lang.Exception {
        try {
            return (com.facebook.ads.internal.api.AdViewApi) com.facebook.ads.redexgen.core.C5M.A00(new com.facebook.ads.redexgen.core.C5P(context, str, str2, adViewParentApi, adView), com.facebook.ads.internal.api.AdViewApi.class);
        } catch (com.facebook.ads.redexgen.core.C0780Jh e) {
            throw new java.lang.Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AudienceNetworkActivityApi createAudienceNetworkActivity(final com.facebook.ads.AudienceNetworkActivity audienceNetworkActivity, final com.facebook.ads.internal.api.AudienceNetworkActivityApi audienceNetworkActivityApi) {
        final com.facebook.ads.redexgen.core.C5Q c5q = new com.facebook.ads.redexgen.core.C5Q(audienceNetworkActivity, audienceNetworkActivityApi);
        return new com.facebook.ads.internal.api.AudienceNetworkActivityApi(audienceNetworkActivity, audienceNetworkActivityApi, c5q) { // from class: com.facebook.ads.redexgen.X.5R
            public static byte[] A03;
            public static java.lang.String[] A04 = {"npa5fyfDyBgpHwGfwNiqfHEj4F8LEiZf", "OqeETugh9", "5goSJATWOcVItDjddk", "82BqGjCZsQ5KSOXOW0A0KlOfyUV9N54d", "DC8qTi6RH4AT7G9O", "9IwTeKuU2aT5NbzWtfQwCWqg5E0PczVH", "CnGxzoUQk", "OIUpXP34AuomSZv"};
            public boolean A00;
            public final com.facebook.ads.internal.api.AudienceNetworkActivityApi A01;
            public final com.facebook.ads.redexgen.core.C5Q A02;

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 41);
                }
                return new java.lang.String(bArrCopyOfRange);
            }

            public static void A01() {
                byte[] bArr = {101, 97, 98, 86, 71, 74, 70, 77, 64, 70, 109, 70, 87, 84, 76, 81, 72, 19, 40, 35, 62, 54, 35, 37, 50, 35, 34, 102, 35, 62, 37, 35, 54, 50, 47, 41, 40, 104, 60, 51, 2, 60, 62, 41, 52, 43, 52, 41, 36};
                if (A04[2].length() == 12) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A04;
                strArr[3] = "H3o2ukg7PoWSfztBPt1oK5BMl3p36c0G";
                strArr[0] = "tZaZcqIYCt5A5bsZPeypVNujsThHJ9sw";
                A03 = bArr;
            }

            static {
                A01();
            }

            {
                this.A01 = audienceNetworkActivityApi;
                this.A02 = c5q;
            }

            private void A02(java.lang.Throwable th) {
                this.A00 = true;
                this.A02.A09();
                finish(8);
                com.facebook.ads.redexgen.core.C7j logContext = this.A02.A06();
                if (logContext != null) {
                    logContext.A07().AA0(A00(38, 11, 116), com.facebook.ads.redexgen.core.C8E.A0C, new com.facebook.ads.redexgen.core.C8F(th));
                    return;
                }
                android.util.Log.e(A00(0, 17, 10), A00(17, 21, 111), th);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
                try {
                    if (this.A00) {
                        this.A01.dump(str, fileDescriptor, printWriter, strArr);
                    } else {
                        this.A02.dump(str, fileDescriptor, printWriter, strArr);
                    }
                } catch (java.lang.Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void finish(int i) {
                this.A02.finish(i);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onActivityResult(int i, int i2, android.content.Intent intent) {
                try {
                    if (this.A00) {
                        this.A01.onActivityResult(i, i2, intent);
                    } else {
                        this.A02.onActivityResult(i, i2, intent);
                        this.A01.onActivityResult(i, i2, intent);
                    }
                } catch (java.lang.Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onBackPressed() {
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onBackPressed();
                } catch (java.lang.Throwable th) {
                    if (A04[5].charAt(6) == 'I') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A04;
                    strArr[7] = "nPADpKrXuoueUGX";
                    strArr[4] = "T13akIzntQNSUZag";
                    A02(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onConfigurationChanged(android.content.res.Configuration configuration) {
                try {
                    if (this.A00) {
                        this.A01.onConfigurationChanged(configuration);
                        return;
                    }
                    this.A02.onConfigurationChanged(configuration);
                    this.A01.onConfigurationChanged(configuration);
                    java.lang.String[] strArr = A04;
                    if (strArr[1].length() != strArr[6].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A04;
                    strArr2[7] = "Q1wJ3SQKEGYG95X";
                    strArr2[4] = "AvO5pGxADzIyCHUj";
                } catch (java.lang.Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onCreate(android.os.Bundle bundle) {
                this.A01.onCreate(bundle);
                try {
                    this.A02.onCreate(bundle);
                } catch (java.lang.Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onDestroy() {
                try {
                    if (this.A00) {
                        this.A01.onDestroy();
                    } else {
                        this.A02.onDestroy();
                        this.A01.onDestroy();
                    }
                } catch (java.lang.Throwable th) {
                    if (A04[2].length() == 12) {
                        throw new java.lang.RuntimeException();
                    }
                    A04[2] = "3CPJLXRae2337PFMI";
                    A02(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onPause() {
                try {
                    if (this.A00) {
                        this.A01.onPause();
                    } else {
                        this.A02.onPause();
                        this.A01.onPause();
                    }
                } catch (java.lang.Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onResume() {
                this.A01.onResume();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onResume();
                } catch (java.lang.Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onSaveInstanceState(android.os.Bundle bundle) {
                this.A01.onSaveInstanceState(bundle);
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onSaveInstanceState(bundle);
                } catch (java.lang.Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onStart() {
                this.A01.onStart();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onStart();
                } catch (java.lang.Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onStop() {
                this.A01.onStop();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onStop();
                } catch (java.lang.Throwable t) {
                    A02(t);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
                try {
                    if (this.A00) {
                        return this.A01.onTouchEvent(motionEvent);
                    }
                    this.A02.onTouchEvent(motionEvent);
                    return this.A01.onTouchEvent(motionEvent);
                } catch (java.lang.Throwable t) {
                    A02(t);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.AudienceNetworkAdsApi createAudienceNetworkAdsApi() {
        if (A01 == null) {
            A01 = new com.facebook.ads.internal.api.AudienceNetworkAdsApi() { // from class: com.facebook.ads.redexgen.X.5T
                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final int getAdFormatForPlacement(java.lang.String str) {
                    com.facebook.ads.redexgen.core.KQ.A02(this);
                    return 0;
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void initialize(android.content.Context context, com.facebook.ads.internal.settings.MultithreadedBundleWrapper initSettings, com.facebook.ads.AudienceNetworkAds.InitListener initListener) throws java.lang.Throwable {
                    if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                        return;
                    }
                    if (initListener == null) {
                        try {
                            initListener = new com.facebook.ads.AudienceNetworkAds.InitListener() { // from class: com.facebook.ads.redexgen.X.5S
                                @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                                public final void onInitialized(com.facebook.ads.AudienceNetworkAds.InitResult initResult) {
                                }
                            };
                        } catch (java.lang.Throwable th) {
                            com.facebook.ads.redexgen.core.KQ.A00(th, this);
                            return;
                        }
                    }
                    com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).getInitApi().initialize(context, initSettings, initListener, 1);
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final boolean isInitialized() throws java.lang.Throwable {
                    if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                        return false;
                    }
                    try {
                        com.facebook.ads.internal.dynamicloading.DynamicLoader dynamicLoader = com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.getDynamicLoader();
                        if (dynamicLoader == null) {
                            return false;
                        }
                        return dynamicLoader.getInitApi().isInitialized();
                    } catch (java.lang.Throwable th) {
                        com.facebook.ads.redexgen.core.KQ.A00(th, this);
                        return false;
                    }
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void onContentProviderCreated(android.content.Context context) throws java.lang.Throwable {
                    if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
                        return;
                    }
                    try {
                        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).getInitApi().onContentProviderCreated(context);
                    } catch (java.lang.Throwable th) {
                        com.facebook.ads.redexgen.core.KQ.A00(th, this);
                    }
                }
            };
        }
        com.facebook.ads.internal.api.AudienceNetworkAdsApi audienceNetworkAdsApi = A01;
        if (A05[2].length() != 22) {
            throw new java.lang.RuntimeException();
        }
        A05[3] = "WLYy1k58X1wQ2fFP1Kpc3q8pOUGU5mJB";
        return audienceNetworkAdsApi;
    }

    @Override // com.facebook.ads.internal.dynamicloading.RemoteRenderingApi
    public com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi createAudienceNetworkExportedActivityApi(android.app.Activity activity) {
        return new com.facebook.ads.redexgen.core.J0(activity);
    }

    @Override // com.facebook.ads.internal.dynamicloading.RemoteRenderingApi
    public com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi createAudienceNetworkRemoteService(android.app.Service service) {
        return new com.facebook.ads.redexgen.core.J1(service);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.BidderTokenProviderApi createBidderTokenProviderApi() {
        return getBidderTokenProviderApi();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi() {
        return new com.facebook.ads.redexgen.core.WJ();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.InterstitialAdApi createInterstitialAd(android.content.Context context, java.lang.String str, com.facebook.ads.InterstitialAd interstitialAd) {
        return (com.facebook.ads.internal.api.InterstitialAdApi) com.facebook.ads.redexgen.core.C5M.A00(new com.facebook.ads.redexgen.core.C04495e(context, str, interstitialAd), com.facebook.ads.internal.api.InterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.MediaViewApi createMediaViewApi() {
        return new com.facebook.ads.redexgen.core.C1229aM();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.MediaViewVideoRendererApi createMediaViewVideoRendererApi() {
        return new com.facebook.ads.redexgen.core.C04525h();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.redexgen.core.C04555k createNativeAdApi(com.facebook.ads.NativeAd nativeAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        return new com.facebook.ads.redexgen.core.C04555k(nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.redexgen.core.C04555k createNativeAdApi(com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        return new com.facebook.ads.redexgen.core.C04555k(nativeAdBase, nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdBaseApi createNativeAdBaseApi(android.content.Context context, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.W7(context, str, (com.facebook.ads.redexgen.core.JT) com.facebook.ads.redexgen.core.W7.A0K(), false);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdBaseApi createNativeAdBaseApi(com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        return new com.facebook.ads.redexgen.core.W7((com.facebook.ads.redexgen.core.W7) nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.NativeAdBase createNativeAdBaseFromBidPayload(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        try {
            return com.facebook.ads.redexgen.core.W7.A0A(context, str, str2);
        } catch (com.facebook.ads.redexgen.core.C0780Jh e) {
            throw new java.lang.Exception(e.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdImageApi createNativeAdImageApi(org.json.JSONObject jSONObject) {
        return com.facebook.ads.redexgen.core.JU.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdLayoutApi createNativeAdLayoutApi() {
        return new com.facebook.ads.redexgen.core.C1228aL();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.redexgen.core.JV createNativeAdRatingApi(org.json.JSONObject jSONObject) {
        return com.facebook.ads.redexgen.core.JV.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdScrollViewApi createNativeAdScrollViewApi(com.facebook.ads.NativeAdScrollView nativeAdScrollView, android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, com.facebook.ads.NativeAdScrollView.AdViewProvider adViewProvider, int i, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes, int i2) {
        return new com.facebook.ads.redexgen.core.C04565l(nativeAdScrollView, context, nativeAdsManager, adViewProvider, i, type, nativeAdViewAttributes, i2);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdViewApi createNativeAdViewApi() {
        if (A02 == null) {
            A02 = new com.facebook.ads.internal.api.NativeAdViewApi() { // from class: com.facebook.ads.redexgen.X.5m
                public static android.view.View A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new com.facebook.ads.NativeAdViewAttributes();
                    }
                    com.facebook.ads.redexgen.core.JW jw = (com.facebook.ads.redexgen.core.JW) nativeAdViewAttributes.getInternalAttributes();
                    com.facebook.ads.redexgen.core.W7 internalNativeAd = com.facebook.ads.redexgen.core.W7.A0L(nativeAd.getInternalNativeAd());
                    internalNativeAd.A1Z(com.facebook.ads.redexgen.core.JX.A00(type.getEnumCode()));
                    internalNativeAd.A1Y(jw);
                    com.facebook.ads.redexgen.core.C0670Ek c0670Ek = new com.facebook.ads.redexgen.core.C0670Ek();
                    com.facebook.ads.NativeAdLayout mediumRectTemplateLayout = new com.facebook.ads.NativeAdLayout(c1199Zs, c0670Ek);
                    c0670Ek.A04(mediumRectTemplateLayout, c1199Zs, nativeAd, jw);
                    mediumRectTemplateLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, (int) (com.facebook.ads.redexgen.core.LP.A02 * type.getHeight())));
                    return mediumRectTemplateLayout;
                }

                public static android.view.View A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new com.facebook.ads.NativeAdViewAttributes();
                    }
                    com.facebook.ads.redexgen.core.W7 w7A0L = com.facebook.ads.redexgen.core.W7.A0L(nativeAd.getInternalNativeAd());
                    com.facebook.ads.redexgen.core.JW jw = (com.facebook.ads.redexgen.core.JW) nativeAdViewAttributes.getInternalAttributes();
                    w7A0L.A1Z(com.facebook.ads.redexgen.core.JX.A0B);
                    w7A0L.A1Y(jw);
                    com.facebook.ads.redexgen.core.C0670Ek c0670Ek = new com.facebook.ads.redexgen.core.C0670Ek();
                    com.facebook.ads.NativeAdLayout nativeAdLayout = new com.facebook.ads.NativeAdLayout(c1199Zs, c0670Ek);
                    c0670Ek.A04(nativeAdLayout, c1199Zs, nativeAd, jw);
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd) {
                    return render(context, nativeAd, (com.facebook.ads.NativeAdViewAttributes) null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdView.Type type) {
                    return render(context, nativeAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(com.facebook.ads.redexgen.core.C04465b.A03(context), nativeAd, type, nativeAdViewAttributes);
                    } catch (java.lang.Throwable th) {
                        return com.facebook.ads.redexgen.core.AbstractC0861Mo.A00(com.facebook.ads.redexgen.core.C04465b.A03(context), th);
                    }
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
                    com.facebook.ads.redexgen.core.C1199Zs contextWrapper;
                    try {
                        if (context instanceof com.facebook.ads.redexgen.core.C1199Zs) {
                            contextWrapper = (com.facebook.ads.redexgen.core.C1199Zs) context;
                        } else {
                            contextWrapper = com.facebook.ads.redexgen.core.C04465b.A03(context);
                        }
                        return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
                    } catch (java.lang.Throwable th) {
                        return com.facebook.ads.redexgen.core.AbstractC0861Mo.A00(com.facebook.ads.redexgen.core.C04465b.A03(context), th);
                    }
                }
            };
        }
        return A02;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdViewAttributesApi createNativeAdViewAttributesApi() {
        return new com.facebook.ads.redexgen.core.JW();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdViewTypeApi createNativeAdViewTypeApi(final int i) {
        return new com.facebook.ads.internal.api.NativeAdViewTypeApi(i) { // from class: com.facebook.ads.redexgen.X.5n
            public final com.facebook.ads.redexgen.core.JX A00;

            {
                this.A00 = com.facebook.ads.redexgen.core.JX.A00(i);
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getHeight() {
                return this.A00.A04();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getValue() {
                return this.A00.A05();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getWidth() {
                return this.A00.A06();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeAdsManagerApi createNativeAdsManagerApi(android.content.Context context, java.lang.String str, int i) {
        return (com.facebook.ads.internal.api.NativeAdsManagerApi) com.facebook.ads.redexgen.core.C5M.A00(new com.facebook.ads.redexgen.core.C04595o(context, str, i), com.facebook.ads.internal.api.NativeAdsManagerApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeBannerAdApi createNativeBannerAdApi(com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        return new com.facebook.ads.internal.api.NativeBannerAdApi(nativeAdBaseApi) { // from class: com.facebook.ads.redexgen.X.5s
            public static byte[] A01;
            public static java.lang.String[] A02 = {"068yMtBHtCdtzUYBTQD9IwnMWW1doBJF", "2l8Hok5ewW", "SqMVYGMc7AyphtDxx4DkXGESiOtqp3Wk", "n7xht10RjuH04nLwyOxbbpbZUJ6bFNP5", "hemUdCIRyaFDmP64bLQtQG29khNbMpFH", "0krrnlsRXu", "j9YMm5Kfv7iMZif7VGfsQGY8YQ9Z0I42", "SiUubuHC3Y"};
            public final com.facebook.ads.redexgen.core.W7 A00;

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    byte b = bArrCopyOfRange[i4];
                    if (A02[0].charAt(2) != '8') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A02;
                    strArr[2] = "SDJ7CqIuYGJEmotuvG7btG7Q2tCK4c6p";
                    strArr[6] = "3TZdd6KNeaSFSkmrHNZK7GULPPfkGOEa";
                    bArrCopyOfRange[i4] = (byte) ((b - i3) - 50);
                }
                return new java.lang.String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{-50, -54, -55, -3, -20, -15, -19, -10, -21, -19, -42, -19, -4, -1, -9, -6, -13};
            }

            static {
                A01();
            }

            {
                this.A00 = com.facebook.ads.redexgen.core.W7.A0L(nativeAdBaseApi);
                this.A00.A1a(com.facebook.ads.redexgen.core.EnumC0783Jl.A05);
            }

            private void A02(android.widget.ImageView imageView, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi2) {
                com.facebook.ads.redexgen.core.W7 w7A0L = com.facebook.ads.redexgen.core.W7.A0L(nativeAdBaseApi2);
                com.facebook.ads.redexgen.core.C1221aE c1221aE = new com.facebook.ads.redexgen.core.C1221aE(this, imageView, w7A0L);
                com.facebook.ads.redexgen.core.JU juA14 = w7A0L.getAdIcon();
                if (juA14 != null) {
                    android.graphics.Bitmap bitmapA0M = w7A0L.A10().A0M(juA14.getUrl());
                    android.content.Context context = imageView.getContext();
                    java.lang.String[] strArr = A02;
                    if (strArr[2].charAt(21) == strArr[6].charAt(21)) {
                        A02[4] = "oesEo3u5gOmbsNZfXjsimFyw8pPXYbZZ";
                        com.facebook.ads.redexgen.core.C1199Zs c1199ZsA03 = com.facebook.ads.redexgen.core.C04465b.A03(context);
                        if (bitmapA0M != null) {
                            android.graphics.drawable.Drawable drawableA05 = com.facebook.ads.redexgen.core.W7.A05(c1199ZsA03, bitmapA0M, w7A0L.A1f(), w7A0L.A1C());
                            com.facebook.ads.redexgen.core.W7.A0e(drawableA05, imageView);
                            imageView.post(new com.facebook.ads.redexgen.core.C1220aD(this, w7A0L, drawableA05));
                            return;
                        } else {
                            com.facebook.ads.redexgen.core.C1221aE c1221aE2 = null;
                            com.facebook.ads.redexgen.core.AsyncTaskC04605p loadImageTask = new com.facebook.ads.redexgen.core.AsyncTaskC04605p(c1199ZsA03, c1221aE, w7A0L.A1f(), c1221aE2);
                            loadImageTask.execute(new com.facebook.ads.redexgen.core.C04625r(juA14.getUrl(), w7A0L.A1C(), c1221aE2));
                            return;
                        }
                    }
                } else {
                    com.facebook.ads.redexgen.core.W6 w6A15 = w7A0L.A15();
                    com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NATIVE_AD_IS_NOT_LOADED;
                    if (A02[4].charAt(17) != 't') {
                        A02[4] = "aFZFEDb6phUkMJAuumeHd9ws0nVx9tBY";
                        w7A0L.A11().A0E().A38(-1L, adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
                        if (w6A15 != null) {
                            w6A15.ABs(com.facebook.ads.redexgen.core.C0779Jg.A00(adErrorType));
                        }
                        android.util.Log.e(A00(0, 17, 86), adErrorType.getDefaultErrorMessage());
                        return;
                    }
                }
                throw new java.lang.RuntimeException();
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(android.view.View view, android.widget.ImageView imageView) {
                registerViewForInteraction(view, imageView, (java.util.List<android.view.View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(android.view.View view, android.widget.ImageView imageView, java.util.List<android.view.View> list) {
                if (imageView != null) {
                    A02(imageView, this.A00);
                }
                if (list != null) {
                    com.facebook.ads.redexgen.core.W7 w7 = this.A00;
                    if (A02[1].length() != 10) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A02;
                    strArr[5] = "ll9cTRtW3a";
                    strArr[7] = "WGLVGgKdvO";
                    w7.A1M(view, imageView, list);
                    return;
                }
                this.A00.A1L(view, imageView);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView) {
                registerViewForInteraction(view, mediaView, (java.util.List<android.view.View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, java.util.List<android.view.View> clickableViews) {
                if (mediaView != null) {
                    ((com.facebook.ads.redexgen.core.C1229aM) mediaView.getMediaViewApi()).A0M(this.A00, true);
                }
                if (clickableViews != null) {
                    this.A00.A1P(view, mediaView, clickableViews, true);
                } else {
                    this.A00.A1Q(view, mediaView, true);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeBannerAdViewApi createNativeBannerAdViewApi() {
        if (A03 == null) {
            A03 = new com.facebook.ads.internal.api.NativeBannerAdViewApi() { // from class: com.facebook.ads.redexgen.X.5t
                public static android.view.View A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.NativeBannerAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new com.facebook.ads.NativeAdViewAttributes();
                    }
                    com.facebook.ads.redexgen.core.W7.A0L(nativeBannerAd.getInternalNativeAd()).A1Z(com.facebook.ads.redexgen.core.JX.A00(type.getEnumCode()));
                    com.facebook.ads.redexgen.core.FK bannerTemplateLayoutApi = new com.facebook.ads.redexgen.core.FK();
                    com.facebook.ads.NativeAdLayout nativeAdLayout = new com.facebook.ads.NativeAdLayout(c1199Zs, bannerTemplateLayoutApi);
                    bannerTemplateLayoutApi.A04(c1199Zs, nativeBannerAd, (com.facebook.ads.redexgen.core.JW) nativeAdViewAttributes.getInternalAttributes(), nativeAdLayout);
                    nativeAdLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, (int) (com.facebook.ads.redexgen.core.LP.A02 * type.getHeight())));
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                public final android.view.View render(android.content.Context context, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.NativeBannerAdView.Type type) {
                    return render(context, nativeBannerAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                public final android.view.View render(android.content.Context context, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.NativeBannerAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(com.facebook.ads.redexgen.core.C04465b.A03(context), nativeBannerAd, type, nativeAdViewAttributes);
                    } catch (java.lang.Throwable th) {
                        return com.facebook.ads.redexgen.core.AbstractC0861Mo.A00(com.facebook.ads.redexgen.core.C04465b.A03(context), th);
                    }
                }
            };
        }
        return A03;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.NativeComponentTagApi createNativeComponentTagApi() {
        return new com.facebook.ads.internal.api.NativeComponentTagApi() { // from class: com.facebook.ads.redexgen.X.5u
            @Override // com.facebook.ads.internal.api.NativeComponentTagApi
            public final void tagView(android.view.View view, com.facebook.ads.NativeAdBase.NativeComponentTag nativeComponentTag) {
                if (view != null && nativeComponentTag != null) {
                    com.facebook.ads.redexgen.core.LU.A03(view, nativeComponentTag);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.RewardedInterstitialAdApi createRewardedInterstitialAd(android.content.Context context, java.lang.String str, com.facebook.ads.RewardedInterstitialAd rewardedInterstitialAd) {
        return (com.facebook.ads.internal.api.RewardedInterstitialAdApi) com.facebook.ads.redexgen.core.C5M.A00(new com.facebook.ads.redexgen.core.C04665v(context, str, rewardedInterstitialAd), com.facebook.ads.internal.api.RewardedInterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.RewardedVideoAdApi createRewardedVideoAd(android.content.Context context, java.lang.String str, com.facebook.ads.RewardedVideoAd rewardedVideoAd) {
        return (com.facebook.ads.internal.api.RewardedVideoAdApi) com.facebook.ads.redexgen.core.C5M.A00(new com.facebook.ads.redexgen.core.C04705z(context, str, rewardedVideoAd), com.facebook.ads.internal.api.RewardedVideoAdApi.class);
    }

    public static com.facebook.ads.redexgen.core.C5Z getBidderTokenProviderApi() {
        if (A04 == null) {
            A04 = new com.facebook.ads.redexgen.core.C5Z();
        }
        return A04;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public com.facebook.ads.internal.api.InitApi getInitApi() {
        return A06;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public void maybeInitInternally(android.content.Context context) {
        com.facebook.ads.redexgen.core.C05138c.A0A(com.facebook.ads.redexgen.core.C04465b.A09(context));
    }
}
