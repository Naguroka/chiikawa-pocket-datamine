package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
public interface TokenStore {
    androidx.browser.trusted.Token load();

    void store(androidx.browser.trusted.Token token);
}
