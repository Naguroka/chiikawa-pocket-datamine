package com.bytedance.sdk.openadsdk.component.reward.view;

/* JADX INFO: loaded from: classes4.dex */
public class RFEndCardBackUpLayout extends com.bytedance.sdk.openadsdk.core.zx.bX {
    private static final java.lang.String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.bg.bg adContext;
    private com.bytedance.sdk.openadsdk.core.widget.PAGLogoView adLogo;
    private com.bytedance.sdk.openadsdk.core.widget.VzQ ivIcon;
    private boolean mInit;
    private com.bytedance.sdk.openadsdk.core.widget.xxp rbScore;
    private int shownAdCount;
    private com.bytedance.sdk.openadsdk.core.zx.Kg tvDesc;
    private com.bytedance.sdk.openadsdk.core.zx.Kg tvDownload;
    private android.widget.TextView tvTitle;

    public RFEndCardBackUpLayout(android.content.Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.Ta.jf);
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.bg.bg bgVar) {
        this.adContext = bgVar;
        if (bgVar.IL.HXG()) {
            initViews();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            initViews();
        }
    }

    private void initViews() {
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        if (this.adContext.IL.eq() && this.shownAdCount > 1) {
            initOneSlotMultipleAdsLayout();
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.adContext.IL;
        if (tuv.HXG()) {
            initViewsForVast();
        } else {
            initViewsDefault();
            initData(tuv, this.tvDownload);
        }
    }

    private void initData(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.zx.Kg kg) {
        setDownloadButtonData(kg, tuv, -1);
        bindIconData(this.ivIcon, tuv);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = this.ivIcon;
        if (vzQ != null) {
            vzQ.setOnClickListener(this.adContext.DDQ.zx());
        }
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = this.rbScore;
        if (xxpVar != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.widget.TextView) null, xxpVar, tuv);
            if (tuv.RiO() != null) {
                this.rbScore.setVisibility(0);
            }
            this.rbScore.setOnClickListener(this.adContext.DDQ.zx());
        }
        if (this.tvTitle != null) {
            if (tuv.RiO() != null && !android.text.TextUtils.isEmpty(tuv.RiO().IL())) {
                this.tvTitle.setText(tuv.RiO().IL());
            } else if (!android.text.TextUtils.isEmpty(tuv.bN())) {
                this.tvTitle.setText(tuv.bN());
            } else {
                this.tvTitle.setVisibility(8);
            }
            this.tvTitle.setOnClickListener(this.adContext.DDQ.zx());
        }
        if (this.tvDesc != null) {
            java.lang.String strWS = tuv.wS();
            if (!android.text.TextUtils.isEmpty(strWS)) {
                this.tvDesc.setText(strWS);
            } else {
                this.tvDesc.setVisibility(8);
            }
            this.tvDesc.setOnClickListener(this.adContext.DDQ.zx());
        }
        this.adLogo.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                try {
                    com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.this.adContext.uu, com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.this.adContext.IL, com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.this.adContext.zx);
                } catch (java.lang.Throwable unused) {
                }
            }
        });
    }

    private void bindIconData(com.bytedance.sdk.openadsdk.core.zx.eqN eqn, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (eqn == null || tuv.sVc() == null || android.text.TextUtils.isEmpty(tuv.sVc().bg())) {
            return;
        }
        com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(tuv.sVc(), eqn, tuv);
    }

    private void bindTitleData(android.widget.TextView textView, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        if (textView != null) {
            if (tuv.RiO() != null && !android.text.TextUtils.isEmpty(tuv.RiO().IL())) {
                textView.setText(tuv.RiO().IL());
            } else {
                textView.setText(str);
            }
        }
    }

    private void initOneSlotMultipleAdsLayout() {
        android.content.Context context = getContext();
        setBackgroundColor(android.graphics.Color.parseColor("#C2FFFFFF"));
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setOrientation(1);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f), 0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(zxVar, layoutParams);
        if (this.adContext.GvG == 2) {
            com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
            zxVar2.setOrientation(0);
            zxVar.addView(zxVar2, new android.widget.FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(zxVar2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(zxVar);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(zxVar);
        }
        com.bytedance.sdk.openadsdk.core.widget.PAGLogoView pAGLogoView = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(this.adContext.uu);
        pAGLogoView.setId(520093757);
        zxVar.addView(pAGLogoView);
        pAGLogoView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.this.adContext.uu, com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.this.adContext.IL, com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.this.adContext.zx);
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutLandscape(com.bytedance.sdk.openadsdk.core.zx.zx zxVar, int i) {
        if (this.adContext.IL instanceof com.bytedance.sdk.openadsdk.core.model.Fy) {
            java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> listBX = ((com.bytedance.sdk.openadsdk.core.model.Fy) this.adContext.IL).eD().bX();
            for (int i2 = 0; i2 < listBX.size() && i2 < i && i2 < 3; i2++) {
                initSingleCardInTwoCardStyleLandscape(zxVar, listBX.get(i2), i2, i);
            }
        }
    }

    private void initSingleCardInTwoCardStyleLandscape(com.bytedance.sdk.openadsdk.core.zx.zx zxVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i, int i2) {
        android.content.Context context = getContext();
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar2.setOrientation(1);
        zxVar2.setGravity(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i > 0) {
            layoutParams.setMargins(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f), 0, 0, 0);
        }
        zxVar2.setBackground(new com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.bg(context));
        zxVar.addView(zxVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar3 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar3.setOrientation(0);
        zxVar3.setGravity(48);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f);
        layoutParams2.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 17.0f);
        layoutParams2.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 30.0f);
        zxVar2.addView(zxVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.eqN vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        zxVar3.addView(vzQ, new android.widget.FrameLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f)));
        bindIconData(vzQ, tuv);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar4 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar4.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 7.0f);
        zxVar3.addView(zxVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg.setSingleLine(true);
        kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg.setTextSize(18.0f);
        kg.setTextColor(android.graphics.Color.parseColor("#161823"));
        kg.setGravity(androidx.core.view.GravityCompat.START);
        kg.setTypeface(null, 1);
        zxVar4.addView(kg, new android.widget.FrameLayout.LayoutParams(-1, -2));
        bindTitleData(kg, tuv, tuv.bN());
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar5 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar5.setOrientation(0);
        zxVar5.setGravity(16);
        zxVar4.addView(zxVar5, new android.widget.FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg2 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg2.setTextSize(16.0f);
        kg2.setTextColor(android.graphics.Color.parseColor("#80161823"));
        zxVar5.addView(kg2, new android.view.ViewGroup.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = new com.bytedance.sdk.openadsdk.core.widget.xxp(context);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f);
        zxVar5.addView(xxpVar, layoutParams4);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(kg2, xxpVar, tuv, 18);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg3 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        if (i2 == 2) {
            kg3.setSingleLine(true);
        } else {
            kg3.setLines(2);
        }
        kg3.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg3.setTextSize(16.0f);
        kg3.setTextColor(android.graphics.Color.parseColor("#80161823"));
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        int i3 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i3;
        layoutParams5.leftMargin = i3;
        layoutParams5.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        zxVar2.addView(kg3, layoutParams5);
        bindDescData(kg3, tuv);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg4 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg4.setGravity(17);
        kg4.setId(520093707);
        kg4.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_video_download_apk"));
        kg4.setTextColor(-1);
        kg4.setTextSize(2, 16.0f);
        kg4.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_reward_full_video_backup_btn_bg"));
        android.widget.FrameLayout.LayoutParams layoutParams6 = new android.widget.FrameLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 36.0f));
        layoutParams6.setMargins(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 22.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f));
        zxVar2.addView(kg4, layoutParams6);
        setDownloadButtonData(kg4, tuv, i);
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(com.bytedance.sdk.openadsdk.core.zx.zx zxVar) {
        if (this.adContext.IL instanceof com.bytedance.sdk.openadsdk.core.model.Fy) {
            java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> listBX = ((com.bytedance.sdk.openadsdk.core.model.Fy) this.adContext.IL).eD().bX();
            for (int i = 0; i < listBX.size() && i < 3; i++) {
                initSingleCardInThreeCardStyle(zxVar, listBX.get(i), i);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(com.bytedance.sdk.openadsdk.core.zx.zx zxVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        android.content.Context context = getContext();
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar2.setOrientation(1);
        zxVar2.setGravity(1);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f) : 0, 0, 0);
        zxVar2.setBackground(new com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.bg(context));
        zxVar.addView(zxVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar3 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar3.setOrientation(0);
        zxVar3.setGravity(16);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f);
        layoutParams2.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 17.0f);
        layoutParams2.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 30.0f);
        zxVar2.addView(zxVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.eqN vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        zxVar3.addView(vzQ, new android.widget.FrameLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 70.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 63.0f)));
        bindIconData(vzQ, tuv);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar4 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar4.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 7.0f);
        zxVar3.addView(zxVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg.setSingleLine(true);
        kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg.setTextSize(18.0f);
        kg.setTextColor(android.graphics.Color.parseColor("#161823"));
        kg.setGravity(androidx.core.view.GravityCompat.START);
        kg.setTypeface(null, 1);
        zxVar4.addView(kg, new android.widget.FrameLayout.LayoutParams(-1, -2));
        bindTitleData(kg, tuv, tuv.bN());
        com.bytedance.sdk.openadsdk.core.zx.Kg kg2 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg2.setSingleLine(true);
        kg2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg2.setTextSize(16.0f);
        kg2.setTextColor(android.graphics.Color.parseColor("#80161823"));
        zxVar4.addView(kg2, new android.widget.FrameLayout.LayoutParams(-1, -2));
        bindDescData(kg2, tuv);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar5 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar5.setOrientation(0);
        zxVar5.setGravity(16);
        zxVar4.addView(zxVar5, new android.widget.FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg3 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg3.setTextSize(16.0f);
        kg3.setTextColor(android.graphics.Color.parseColor("#80161823"));
        zxVar5.addView(kg3, new android.view.ViewGroup.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = new com.bytedance.sdk.openadsdk.core.widget.xxp(context);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f);
        zxVar5.addView(xxpVar, layoutParams4);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(kg3, xxpVar, tuv, 18);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg4 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg4.setGravity(17);
        kg4.setId(520093707);
        kg4.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_video_download_apk"));
        kg4.setTextColor(-1);
        kg4.setTextSize(2, 16.0f);
        kg4.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_reward_full_video_backup_btn_bg"));
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 36.0f));
        layoutParams5.setMargins(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 22.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f));
        zxVar2.addView(kg4, layoutParams5);
        setDownloadButtonData(kg4, tuv, i);
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(com.bytedance.sdk.openadsdk.core.zx.zx zxVar) {
        if (this.adContext.IL instanceof com.bytedance.sdk.openadsdk.core.model.Fy) {
            java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> listBX = ((com.bytedance.sdk.openadsdk.core.model.Fy) this.adContext.IL).eD().bX();
            for (int i = 0; i < listBX.size() && i < 2; i++) {
                initSingleCardInTwoCardStyle(zxVar, listBX.get(i), i);
            }
        }
    }

    private void initSingleCardInTwoCardStyle(com.bytedance.sdk.openadsdk.core.zx.zx zxVar, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        android.content.Context context = getContext();
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar2.setOrientation(1);
        zxVar2.setGravity(1);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f) : 0, 0, 0);
        zxVar2.setBackground(new com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.bg(context));
        zxVar.addView(zxVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.zx.eqN vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 70.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 63.0f));
        layoutParams2.setMargins(0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f), 0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f));
        zxVar2.addView(vzQ, layoutParams2);
        bindIconData(vzQ, tuv);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg.setSingleLine(true);
        kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg.setTextSize(18.0f);
        kg.setTextColor(android.graphics.Color.parseColor("#161823"));
        kg.setGravity(17);
        kg.setTypeface(null, 1);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 56.0f), 0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 56.0f), 0);
        zxVar2.addView(kg, layoutParams3);
        bindTitleData(kg, tuv, tuv.bN());
        com.bytedance.sdk.openadsdk.core.zx.Kg kg2 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg2.setSingleLine(true);
        kg2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg2.setTextSize(16.0f);
        kg2.setTextColor(android.graphics.Color.parseColor("#80161823"));
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 56.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 4.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 56.0f), 0);
        zxVar2.addView(kg2, layoutParams4);
        bindDescData(kg2, tuv);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar3 = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar3.setOrientation(0);
        zxVar3.setGravity(16);
        zxVar2.addView(zxVar3, new android.widget.FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg3 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg3.setTextSize(16.0f);
        kg3.setTextColor(android.graphics.Color.parseColor("#80161823"));
        zxVar3.addView(kg3, new android.view.ViewGroup.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.widget.xxp xxpVar = new com.bytedance.sdk.openadsdk.core.widget.xxp(context);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f);
        zxVar3.addView(xxpVar, layoutParams5);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(kg3, xxpVar, tuv, 18);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg4 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        kg4.setGravity(17);
        kg4.setId(520093707);
        kg4.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_video_download_apk"));
        kg4.setTextColor(-1);
        kg4.setTextSize(2, 16.0f);
        kg4.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_reward_full_video_backup_btn_bg"));
        android.widget.FrameLayout.LayoutParams layoutParams6 = new android.widget.FrameLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 36.0f));
        layoutParams6.setMargins(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 36.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 20.0f));
        zxVar2.addView(kg4, layoutParams6);
        setDownloadButtonData(kg4, tuv, i);
    }

    private void bindDescData(com.bytedance.sdk.openadsdk.core.zx.Kg kg, com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (kg == null) {
            return;
        }
        java.lang.String strCZH = tuv.cZH();
        if (android.text.TextUtils.isEmpty(strCZH)) {
            return;
        }
        kg.setText(strCZH);
    }

    private void setDownloadButtonData(com.bytedance.sdk.openadsdk.core.zx.Kg kg, com.bytedance.sdk.openadsdk.core.model.tuV tuv, int i) {
        com.bytedance.sdk.openadsdk.core.IL.zx zxVarBg = this.adContext.DDQ.bg(this.adContext, tuv);
        zxVarBg.bg(com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this.adContext.uu, tuv, this.adContext.zx));
        if (i != -1) {
            java.util.HashMap map = new java.util.HashMap();
            map.put("ad_show_order", java.lang.Integer.valueOf(i + 1));
            zxVarBg.bg(map);
        }
        kg.setOnClickListener(zxVarBg);
        kg.setOnTouchListener(zxVarBg);
        java.lang.CharSequence charSequenceZCS = tuv.zCS();
        if (android.text.TextUtils.isEmpty(charSequenceZCS)) {
            return;
        }
        kg.setText(charSequenceZCS);
    }

    private void initViewsForVast() {
        android.content.Context context = getContext();
        setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(context);
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.Kg);
        eqn.setVisibility(8);
        addView(eqn, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.component.WR.eqN eqn2 = new com.bytedance.sdk.component.WR.eqN(context, true);
        eqn2.setVisibility(8);
        eqn2.setId(com.bytedance.sdk.openadsdk.utils.Ta.WR);
        addView(eqn2, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    private void initViewsDefault() {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.content.Context context = getContext();
        boolean z = this.adContext.IL.xFs() == 1;
        setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(context);
        zxVar.setGravity(1);
        zxVar.setOrientation(1);
        if (z) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new android.widget.FrameLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 327.0f), -2);
        }
        layoutParams.gravity = 17;
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        layoutParams.rightMargin = iBX;
        layoutParams.leftMargin = iBX;
        addView(zxVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(context);
        this.ivIcon = vzQ;
        vzQ.setBackgroundColor(0);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 80.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 80.0f));
        layoutParams2.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        zxVar.addView(this.ivIcon, layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.tvTitle = kg;
        kg.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        zxVar.addView(this.tvTitle, new android.widget.LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.zx.Kg kg2 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.tvDesc = kg2;
        kg2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(android.graphics.Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f);
        zxVar.addView(this.tvDesc, layoutParams3);
        this.rbScore = new com.bytedance.sdk.openadsdk.core.widget.xxp(context, true);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 16.0f));
        layoutParams4.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 12.0f);
        this.rbScore.setVisibility(8);
        zxVar.addView(this.rbScore, layoutParams4);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg3 = new com.bytedance.sdk.openadsdk.core.zx.Kg(context);
        this.tvDownload = kg3;
        kg3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(com.bytedance.sdk.component.utils.Fy.bg(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(context, "tt_reward_full_video_backup_btn_bg"));
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 44.0f));
        layoutParams5.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 54.0f);
        zxVar.addView(this.tvDownload, layoutParams5);
        this.adLogo = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(context);
        android.widget.FrameLayout.LayoutParams layoutParams6 = new android.widget.FrameLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    public void setShownAdCount(int i) {
        this.shownAdCount = i;
    }

    private static final class bg extends android.graphics.drawable.Drawable {
        private final android.graphics.drawable.Drawable IL;
        private final int bX;
        android.graphics.Path bg = new android.graphics.Path();

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        }

        public bg(android.content.Context context) {
            this.IL = com.bytedance.sdk.component.utils.Fy.bX(context, "tt_ad_bg_header_gradient");
            this.bX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            canvas.clipPath(this.bg);
            canvas.drawColor(-1);
            this.IL.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            float f = i3;
            this.IL.setBounds(i, i2, i3, (int) (((1.0f * f) / this.IL.getIntrinsicWidth()) * this.IL.getIntrinsicHeight()));
            this.bg.reset();
            android.graphics.Path path = this.bg;
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f, i4);
            int i5 = this.bX;
            path.addRoundRect(rectF, i5, i5, android.graphics.Path.Direction.CCW);
        }
    }
}
