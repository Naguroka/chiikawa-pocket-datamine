package com.json.mediationsdk.integration;

/* JADX INFO: loaded from: classes5.dex */
public class IntegrationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f2980a = "IntegrationHelper";
    private static final java.lang.String b = "4.1";
    private static final java.lang.String c = "4.3";

    class a extends java.lang.Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f2981a;

        a(android.content.Context context) {
            this.f2981a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                android.util.Log.w(com.json.mediationsdk.integration.IntegrationHelper.f2980a, "--------------- Google Play Services --------------");
                if (this.f2981a.getPackageManager().getApplicationInfo(this.f2981a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    android.util.Log.i(com.json.mediationsdk.integration.IntegrationHelper.f2980a, "Google Play Services - VERIFIED");
                    java.lang.String strB = com.json.mediationsdk.p.m().b(this.f2981a);
                    if (!android.text.TextUtils.isEmpty(strB)) {
                        android.util.Log.i(com.json.mediationsdk.integration.IntegrationHelper.f2980a, "GAID is: " + strB + " (use this for test devices)");
                    }
                } else {
                    android.util.Log.e(com.json.mediationsdk.integration.IntegrationHelper.f2980a, "Google Play Services - MISSING");
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                android.util.Log.e(com.json.mediationsdk.integration.IntegrationHelper.f2980a, "Google Play Services - MISSING");
            }
        }
    }

    private static com.json.mediationsdk.IntegrationData a(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        try {
            com.json.mediationsdk.IntegrationData integrationData = (com.json.mediationsdk.IntegrationData) java.lang.Class.forName(str).getMethod("getIntegrationData", android.content.Context.class).invoke(null, context);
            android.util.Log.i(f2980a, "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (java.lang.ClassNotFoundException e) {
            com.json.l9.d().a(e);
            str2 = "Adapter - MISSING";
            android.util.Log.e(f2980a, str2);
            return null;
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            str2 = "Adapter version - NOT VERIFIED";
            android.util.Log.e(f2980a, str2);
            return null;
        }
    }

    private static void a(android.content.Context context) {
        new com.ironsource.mediationsdk.integration.IntegrationHelper.a(context).start();
    }

    private static void a(java.lang.String str) {
        try {
            android.util.Log.i(f2980a, "SDK Version - " + ((java.lang.String) java.lang.Class.forName(str).getMethod("getAdapterSDKVersion", new java.lang.Class[0]).invoke(null, new java.lang.Object[0])));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            android.util.Log.w("validateSDKVersion", "Unable to get SDK version");
        }
    }

    private static boolean a(com.json.mediationsdk.IntegrationData integrationData) {
        if (integrationData.version.startsWith(b) || integrationData.version.startsWith(c)) {
            android.util.Log.i(f2980a, "Adapter - VERIFIED");
            return true;
        }
        android.util.Log.e(f2980a, integrationData.name + " adapter " + integrationData.version + " is incompatible with SDK version " + com.json.mediationsdk.utils.IronSourceUtils.getSDKVersion() + ", please update your adapter to version 4.1.*");
        return false;
    }

    private static void b(android.content.Context context) {
        android.util.Log.i(f2980a, "*** Permissions ***");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
            android.util.Log.i(f2980a, "android.permission.INTERNET - VERIFIED");
        } else {
            android.util.Log.e(f2980a, "android.permission.INTERNET - MISSING");
        }
        if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            android.util.Log.i(f2980a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
        } else {
            android.util.Log.e(f2980a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    private static boolean b(android.content.Context context, java.lang.String str) {
        byte b2;
        java.lang.String str2;
        try {
            java.lang.String lowerCase = com.json.environment.StringUtils.toLowerCase(str);
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -805296079) {
                if (iHashCode != 92668925) {
                    if (iHashCode == 497130182 && lowerCase.equals("facebook")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                } else if (lowerCase.equals(com.applovin.sdk.AppLovinMediationProvider.ADMOB)) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (lowerCase.equals("vungle")) {
                b2 = 2;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                str2 = "--------------- Meta --------------";
            } else if (b2 != 1) {
                str2 = b2 != 2 ? "--------------- " + str + " --------------" : "--------------- Liftoff Monetization --------------";
            } else {
                str2 = "--------------- Google (AdMob and Ad Manager) --------------";
            }
            android.util.Log.i(f2980a, str2);
            java.lang.String str3 = "com.ironsource.adapters." + com.json.environment.StringUtils.toLowerCase(str) + "." + str + "Adapter";
            com.json.mediationsdk.IntegrationData integrationDataA = a(context, str3);
            if (integrationDataA == null) {
                return false;
            }
            if (!str.equalsIgnoreCase("IronSource") && !a(integrationDataA)) {
                return false;
            }
            a(str3);
            return true;
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            android.util.Log.e(f2980a, "isAdapterValid " + str, e);
            return false;
        }
    }

    public static void validateIntegration(android.content.Context context) {
        java.lang.String str;
        android.util.Log.i(f2980a, "Verifying Integration:");
        b(context);
        java.lang.String[] strArr = {"AppLovin", "APS", "BidMachine", "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", "Vungle", "Maio", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "Smaato", "SuperAwesome", "UnityAds", "Verve", "Yandex"};
        for (int i = 0; i < 24; i++) {
            java.lang.String str2 = strArr[i];
            if (!b(context, str2)) {
                java.lang.String lowerCase = com.json.environment.StringUtils.toLowerCase(str2);
                lowerCase.hashCode();
                lowerCase.hashCode();
                switch (lowerCase) {
                    case "vungle":
                        str = ">>>> Liftoff Monetization - NOT VERIFIED";
                        break;
                    case "admob":
                        str = ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED";
                        break;
                    case "facebook":
                        str = ">>>> Meta - NOT VERIFIED";
                        break;
                    default:
                        android.util.Log.e(f2980a, ">>>> " + str2 + " - NOT VERIFIED");
                        continue;
                        break;
                }
            } else {
                java.lang.String lowerCase2 = com.json.environment.StringUtils.toLowerCase(str2);
                lowerCase2.hashCode();
                lowerCase2.hashCode();
                switch (lowerCase2.hashCode()) {
                    case -805296079:
                        if (lowerCase2.equals("vungle")) {
                        }
                        break;
                    case 92668925:
                        if (lowerCase2.equals(com.applovin.sdk.AppLovinMediationProvider.ADMOB)) {
                        }
                        break;
                    case 497130182:
                        if (!lowerCase2.equals("facebook")) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    Method dump skipped, instruction units count: 302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.json.mediationsdk.integration.IntegrationHelper.validateIntegration(android.content.Context):void");
            }
        }
