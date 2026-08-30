package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
class DeviceMappedEncoderBitrateProvider implements androidx.media3.transformer.EncoderBitrateProvider {
    DeviceMappedEncoderBitrateProvider() {
    }

    @Override // androidx.media3.transformer.EncoderBitrateProvider
    public int getBitrate(java.lang.String str, int i, int i2, float f) {
        return (int) (((double) (i * i2 * f)) * getBitrateMultiplierFromMapping(str, androidx.media3.common.util.Util.SDK_INT, android.os.Build.MODEL, "" + i + "x" + i2, java.lang.Math.round(f)));
    }

    private static double getBitrateMultiplierFromMapping(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, int i2) {
        byte b;
        str.hashCode();
        switch (str) {
            case "OMX.IMG.TOPAZ.VIDEO.Encoder":
                str2.hashCode();
                switch (str2) {
                    case "ANE-LX1":
                    case "ANE-LX2":
                        str3.hashCode();
                        switch (str3) {
                            case "1280x720":
                                return 0.245d;
                            case "1920x1080":
                                return i2 != 60 ? 0.2625d : 0.1925d;
                            case "3840x2160":
                                return 0.23208d;
                            default:
                                return 0.28d;
                        }
                    case "FIG-LX1":
                        return 0.245d;
                    default:
                        return 0.28d;
                }
            case "OMX.Exynos.AVC.Encoder":
                switch (i) {
                    case 24:
                        str2.hashCode();
                        if (str2.equals("SM-G920V")) {
                            return 0.245d;
                        }
                        return !str2.equals("SM-G935F") ? 0.37188d : 0.2625d;
                    case 25:
                    default:
                        return 1.4d;
                    case 26:
                        str2.hashCode();
                        switch (str2) {
                            case "SM-A520F":
                            case "SM-J600G":
                                return 0.3325d;
                            case "SM-G930F":
                                return 0.20125d;
                            case "SM-G935F":
                                str3.hashCode();
                                return !str3.equals("1920x1080") ? 0.315d : 0.1225d;
                            case "SM-G950F":
                                return 0.2975d;
                            case "SM-G955F":
                                str3.hashCode();
                                switch (str3) {
                                    case "640x480":
                                        return 0.245d;
                                    case "1920x1080":
                                        return i2 != 60 ? 0.175d : 0.14d;
                                    case "3840x2160":
                                        return 0.0914d;
                                    default:
                                        return 0.2975d;
                                }
                            case "SM-G960F":
                                str3.hashCode();
                                if (str3.equals("1920x1080")) {
                                    return i2 != 30 ? 0.175d : 0.1575d;
                                }
                                return 0.35d;
                            default:
                                return 0.35d;
                        }
                    case 27:
                        str2.hashCode();
                        switch (str2) {
                            case "SM-G610F":
                            case "SM-J260F":
                                return 0.3325d;
                            case "SM-J260G":
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.41563d;
                                }
                                return !str3.equals("1920x1080") ? 0.525d : 0.4375d;
                            case "SM-M205F":
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.41563d;
                                }
                                if (str3.equals("1920x1080")) {
                                    return i2 != 60 ? 0.315d : 0.28d;
                                }
                                return 0.56875d;
                            default:
                                return 0.56875d;
                        }
                    case 28:
                        str2.hashCode();
                        switch (str2) {
                            case "SM-G950F":
                                str3.hashCode();
                                if (str3.equals("1280x720")) {
                                    return 0.1925d;
                                }
                                if (str3.equals("1920x1080")) {
                                    return i2 != 60 ? 0.21d : 0.175d;
                                }
                                return 0.245d;
                            case "SM-G955F":
                                return 0.1925d;
                            case "SM-G965F":
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.21d;
                                }
                                return !str3.equals("1920x1080") ? 0.39375d : 0.11375d;
                            case "SM-G965N":
                                str3.hashCode();
                                switch (str3) {
                                    case "640x480":
                                        return 0.21d;
                                    case "1920x1080":
                                        return 0.175d;
                                    case "3840x2160":
                                        return 0.08269d;
                                    default:
                                        return 0.39375d;
                                }
                            case "SM-J701F":
                                return 0.3325d;
                            case "SM-N960F":
                            case "SM-N960N":
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.21d;
                                }
                                if (str3.equals("1920x1080")) {
                                    return i2 != 60 ? 0.1925d : 0.175d;
                                }
                                return 0.39375d;
                            case "SM-A105FN":
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.41563d;
                                }
                                return !str3.equals("1920x1080") ? 0.7d : 0.35d;
                            default:
                                return 0.7d;
                        }
                    case 29:
                        str2.hashCode();
                        switch (str2) {
                            case "SM-G977N":
                                str3.hashCode();
                                return !str3.equals("1280x720") ? 0.7d : 0.4375d;
                            case "SM-N970F":
                                return 0.245d;
                            case "SM-A105FN":
                                str3.hashCode();
                                switch (str3) {
                                    case "640x480":
                                        return 0.4375d;
                                    case "1280x720":
                                        return 0.7d;
                                    case "1920x1080":
                                        return i2 != 30 ? 1.4d : 1.05d;
                                    default:
                                        return 1.4d;
                                }
                            default:
                                return 1.4d;
                        }
                    case 30:
                        str2.hashCode();
                        switch (str2) {
                            case "SM-A127F":
                            case "SM-A217F":
                                return 0.35d;
                            case "SM-A505F":
                            case "SM-A515F":
                            case "SM-M315F":
                            case "SM-A515U1":
                                return 0.1925d;
                            default:
                                return 0.37188d;
                        }
                    case 31:
                        return 0.245d;
                }
            case "OMX.MTK.VIDEO.ENCODER.AVC":
                switch (i) {
                    case 22:
                        return 0.245d;
                    case 23:
                        str2.hashCode();
                        switch (str2) {
                            case "Redmi Note 4":
                                return 0.35d;
                            case "SM-G532G":
                                str3.hashCode();
                                if (!str3.equals("1280x720")) {
                                    return 0.525d;
                                }
                            case "SM-G532F":
                                return 0.39375d;
                            case "LG-K430":
                                return 0.28d;
                            default:
                                return 0.525d;
                        }
                        break;
                    case 24:
                        str2.hashCode();
                        return !str2.equals("Moto C") ? 0.28d : 0.2625d;
                    case 25:
                    case 26:
                    default:
                        return 0.7d;
                    case 27:
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case -708142594:
                                if (str2.equals("Redmi 6A")) {
                                }
                                break;
                            case -509282093:
                                if (str2.equals("Nokia 1")) {
                                }
                                break;
                            case 1691546209:
                                if (str2.equals("CPH1920")) {
                                }
                                break;
                            case 1965191908:
                                if (str2.equals("Infinix X650")) {
                                }
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
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
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
                            Method dump skipped, instruction units count: 8276
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.transformer.DeviceMappedEncoderBitrateProvider.getBitrateMultiplierFromMapping(java.lang.String, int, java.lang.String, java.lang.String, int):double");
                    }
                }
