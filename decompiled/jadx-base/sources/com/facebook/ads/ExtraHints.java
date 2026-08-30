package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public class ExtraHints {
    private static final java.lang.String HINTS_JSON_KEY = "hints";
    private static final int KEYWORDS_MAX_COUNT = 5;
    private static final java.lang.String KEYWORD_SEPARATOR = ";";
    private final java.lang.String mHintsSerialized;
    private final java.lang.String mMediationData;

    private ExtraHints(java.util.HashMap<com.facebook.ads.ExtraHints.HintType, java.lang.String> map, java.lang.String str) {
        this.mMediationData = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.util.Map.Entry<com.facebook.ads.ExtraHints.HintType, java.lang.String> entry : map.entrySet()) {
            try {
                jSONObject2.put(entry.getKey().mKey, entry.getValue());
            } catch (org.json.JSONException unused) {
            }
        }
        try {
            jSONObject.put(HINTS_JSON_KEY, jSONObject2);
        } catch (org.json.JSONException unused2) {
        }
        this.mHintsSerialized = jSONObject.toString();
    }

    public java.lang.String getHints() {
        return this.mHintsSerialized;
    }

    public java.lang.String getMediationData() {
        return this.mMediationData;
    }

    public enum HintType {
        KEYWORDS("keywords"),
        CONTENT_URL("content_url"),
        EXTRA_DATA("extra_data");

        private java.lang.String mKey;

        HintType(java.lang.String str) {
            this.mKey = str;
        }
    }

    @java.lang.Deprecated
    public enum Keyword {
        ACCESSORIES("accessories"),
        ART_HISTORY("art_history"),
        AUTOMOTIVE("automotive"),
        BEAUTY("beauty"),
        BIOLOGY("biology"),
        BOARD_GAMES("board_games"),
        BUSINESS_SOFTWARE("business_software"),
        BUYING_SELLING_HOMES("buying_selling_homes"),
        CATS("cats"),
        CELEBRITIES("celebrities"),
        CLOTHING("clothing"),
        COMIC_BOOKS("comic_books"),
        DESKTOP_VIDEO("desktop_video"),
        DOGS("dogs"),
        EDUCATION("education"),
        EMAIL("email"),
        ENTERTAINMENT("entertainment"),
        FAMILY_PARENTING("family_parenting"),
        FASHION("fashion"),
        FINE_ART("fine_art"),
        FOOD_DRINK("food_drink"),
        FRENCH_CUISINE("french_cuisine"),
        GOVERNMENT("government"),
        HEALTH_FITNESS("health_fitness"),
        HOBBIES("hobbies"),
        HOME_GARDEN("home_garden"),
        HUMOR("humor"),
        INTERNET_TECHNOLOGY("internet_technology"),
        LARGE_ANIMALS("large_animals"),
        LAW("law"),
        LEGAL_ISSUES("legal_issues"),
        LITERATURE("literature"),
        MARKETING("marketing"),
        MOVIES("movies"),
        MUSIC("music"),
        NEWS("news"),
        PERSONAL_FINANCE("personal_finance"),
        PETS("pets"),
        PHOTOGRAPHY("photography"),
        POLITICS("politics"),
        REAL_ESTATE("real_estate"),
        ROLEPLAYING_GAMES("roleplaying_games"),
        SCIENCE("science"),
        SHOPPING("shopping"),
        SOCIETY("society"),
        SPORTS("sports"),
        TECHNOLOGY("technology"),
        TELEVISION("television"),
        TRAVEL("travel"),
        VIDEO_COMPUTER_GAMES("video_computer_games");

        private java.lang.String mKeyword;

        Keyword(java.lang.String str) {
            this.mKeyword = str;
        }
    }

    @java.lang.Deprecated
    public static class Builder {
        private java.util.HashMap<com.facebook.ads.ExtraHints.HintType, java.lang.String> mHints = new java.util.HashMap<>();
        private java.lang.String mMediationData;

        @java.lang.Deprecated
        public com.facebook.ads.ExtraHints.Builder keywords(java.util.List<com.facebook.ads.ExtraHints.Keyword> list) {
            return this;
        }

        public com.facebook.ads.ExtraHints.Builder extraData(java.lang.String str) {
            if (str == null) {
                return this;
            }
            this.mHints.put(com.facebook.ads.ExtraHints.HintType.EXTRA_DATA, str);
            return this;
        }

        public com.facebook.ads.ExtraHints.Builder contentUrl(java.lang.String str) {
            if (str == null) {
                return this;
            }
            this.mHints.put(com.facebook.ads.ExtraHints.HintType.CONTENT_URL, str);
            return this;
        }

        public com.facebook.ads.ExtraHints.Builder mediationData(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str)) {
                return this;
            }
            this.mMediationData = str;
            return this;
        }

        public com.facebook.ads.ExtraHints build() {
            return new com.facebook.ads.ExtraHints(this.mHints, this.mMediationData);
        }
    }

    private static java.lang.String join(java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(KEYWORD_SEPARATOR);
        }
        return sb.toString();
    }
}
