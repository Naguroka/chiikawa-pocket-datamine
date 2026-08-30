package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class XB extends com.facebook.ads.redexgen.core.AbstractC0713Go {
    public static java.lang.String[] A01 = {"345", "FfDXMYzxXX", "vOpcwtbjBUDLg7W", "vwl6", "8z1", "veIKYNosptAQN6qLcG3", "gZDMPK8cRuT1y1gEfTueAQyhJzVpTsF6", "gXo"};
    public com.facebook.ads.redexgen.core.C0708Gj A00;

    public abstract android.util.Pair<com.facebook.ads.redexgen.core.AG[], com.facebook.ads.redexgen.core.InterfaceC0710Gl[]> A0V(com.facebook.ads.redexgen.core.C0708Gj c0708Gj, int[][][] iArr, int[] iArr2) throws com.facebook.ads.redexgen.core.C05449h;

    public static int A0Q(com.facebook.ads.redexgen.core.AF[] afArr, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup) throws com.facebook.ads.redexgen.core.C05449h {
        int formatSupportLevel = afArr.length;
        int trackIndex = 0;
        for (int i = 0; i < bestRendererIndex; i++) {
            com.facebook.ads.redexgen.core.AF af = afArr[i];
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = af.AH6(trackGroup.A01(bestFormatSupportLevel));
                int bestRendererIndex2 = bestRendererIndex & 7;
                if (bestRendererIndex2 > trackIndex) {
                    formatSupportLevel = i;
                    trackIndex = bestRendererIndex2;
                    if (trackIndex == 4) {
                        return formatSupportLevel;
                    }
                }
            }
        }
        return formatSupportLevel;
    }

    public static int[] A0R(com.facebook.ads.redexgen.core.AF af, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup trackGroup) throws com.facebook.ads.redexgen.core.C05449h {
        int[] iArr = new int[trackGroup.A01];
        for (int i = 0; i < trackGroup.A01; i++) {
            iArr[i] = af.AH6(trackGroup.A01(i));
        }
        return iArr;
    }

    public static int[] A0S(com.facebook.ads.redexgen.core.AF[] afArr) throws com.facebook.ads.redexgen.core.C05449h {
        int[] iArr = new int[afArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = afArr[i].AH8();
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0713Go
    public final com.facebook.ads.redexgen.core.C0714Gp A0T(com.facebook.ads.redexgen.core.AF[] afArr, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray trackGroupArray) throws com.facebook.ads.redexgen.core.C05449h {
        int[] iArrA0R;
        int[] iArr = new int[afArr.length + 1];
        com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[][] rendererTrackGroups = new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[afArr.length + 1][];
        int[][][] iArr2 = new int[afArr.length + 1][][];
        for (int i = 0; i < rendererTrackGroups.length; i++) {
            rendererTrackGroups[i] = new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[trackGroupArray.A01];
            iArr2[i] = new int[trackGroupArray.A01][];
        }
        int[] iArrA0S = A0S(afArr);
        for (int rendererIndex = 0; rendererIndex < trackGroupArray.A01; rendererIndex++) {
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup group = trackGroupArray.A01(rendererIndex);
            int groupIndex = A0Q(afArr, group);
            if (groupIndex == afArr.length) {
                int i2 = group.A01;
                if (A01[1].length() == 20) {
                    throw new java.lang.RuntimeException();
                }
                A01[1] = "Qr8HrRU9lFqgPA0W8kPuONAnzw";
                iArrA0R = new int[i2];
            } else {
                com.facebook.ads.redexgen.core.AF af = afArr[groupIndex];
                java.lang.String[] strArr = A01;
                if (strArr[7].length() != strArr[4].length()) {
                    iArrA0R = A0R(af, group);
                } else {
                    A01[6] = "EvETe5B0Bd5mG8cCaH8U5OecDBUSnDnc";
                    iArrA0R = A0R(af, group);
                }
            }
            int i3 = iArr[groupIndex];
            rendererTrackGroups[groupIndex][i3] = group;
            iArr2[groupIndex][i3] = iArrA0R;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray[] trackGroupArrayArr = new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray[afArr.length];
        int[] iArr3 = new int[afArr.length];
        for (int i4 = 0; i4 < afArr.length; i4++) {
            int i5 = iArr[i4];
            trackGroupArrayArr[i4] = new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray((com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[]) com.facebook.ads.redexgen.core.IK.A0k(rendererTrackGroups[i4], i5));
            iArr2[i4] = (int[][]) com.facebook.ads.redexgen.core.IK.A0k(iArr2[i4], i5);
            iArr3[i4] = afArr[i4].A8a();
        }
        com.facebook.ads.redexgen.core.C0708Gj c0708Gj = new com.facebook.ads.redexgen.core.C0708Gj(iArr3, trackGroupArrayArr, iArrA0S, iArr2, new com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray((com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup[]) com.facebook.ads.redexgen.core.IK.A0k(rendererTrackGroups[afArr.length], iArr[afArr.length])));
        android.util.Pair<com.facebook.ads.redexgen.core.AG[], com.facebook.ads.redexgen.core.InterfaceC0710Gl[]> pairA0V = A0V(c0708Gj, iArr2, iArrA0S);
        return new com.facebook.ads.redexgen.core.C0714Gp((com.facebook.ads.redexgen.core.AG[]) pairA0V.first, (com.facebook.ads.redexgen.core.InterfaceC0710Gl[]) pairA0V.second, c0708Gj);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0713Go
    public final void A0U(java.lang.Object obj) {
        this.A00 = (com.facebook.ads.redexgen.core.C0708Gj) obj;
    }
}
