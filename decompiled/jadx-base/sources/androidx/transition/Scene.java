package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
public class Scene {
    private android.content.Context mContext;
    private java.lang.Runnable mEnterAction;
    private java.lang.Runnable mExitAction;
    private android.view.View mLayout;
    private int mLayoutId;
    private android.view.ViewGroup mSceneRoot;

    public static androidx.transition.Scene getSceneForLayout(android.view.ViewGroup viewGroup, int i, android.content.Context context) {
        android.util.SparseArray sparseArray = (android.util.SparseArray) viewGroup.getTag(androidx.transition.R.id.transition_scene_layoutid_cache);
        if (sparseArray == null) {
            sparseArray = new android.util.SparseArray();
            viewGroup.setTag(androidx.transition.R.id.transition_scene_layoutid_cache, sparseArray);
        }
        androidx.transition.Scene scene = (androidx.transition.Scene) sparseArray.get(i);
        if (scene != null) {
            return scene;
        }
        androidx.transition.Scene scene2 = new androidx.transition.Scene(viewGroup, i, context);
        sparseArray.put(i, scene2);
        return scene2;
    }

    public Scene(android.view.ViewGroup viewGroup) {
        this.mLayoutId = -1;
        this.mSceneRoot = viewGroup;
    }

    private Scene(android.view.ViewGroup viewGroup, int i, android.content.Context context) {
        this.mContext = context;
        this.mSceneRoot = viewGroup;
        this.mLayoutId = i;
    }

    public Scene(android.view.ViewGroup viewGroup, android.view.View view) {
        this.mLayoutId = -1;
        this.mSceneRoot = viewGroup;
        this.mLayout = view;
    }

    public android.view.ViewGroup getSceneRoot() {
        return this.mSceneRoot;
    }

    public void exit() {
        java.lang.Runnable runnable;
        if (getCurrentScene(this.mSceneRoot) != this || (runnable = this.mExitAction) == null) {
            return;
        }
        runnable.run();
    }

    public void enter() {
        if (this.mLayoutId > 0 || this.mLayout != null) {
            getSceneRoot().removeAllViews();
            if (this.mLayoutId > 0) {
                android.view.LayoutInflater.from(this.mContext).inflate(this.mLayoutId, this.mSceneRoot);
            } else {
                this.mSceneRoot.addView(this.mLayout);
            }
        }
        java.lang.Runnable runnable = this.mEnterAction;
        if (runnable != null) {
            runnable.run();
        }
        setCurrentScene(this.mSceneRoot, this);
    }

    static void setCurrentScene(android.view.ViewGroup viewGroup, androidx.transition.Scene scene) {
        viewGroup.setTag(androidx.transition.R.id.transition_current_scene, scene);
    }

    public static androidx.transition.Scene getCurrentScene(android.view.ViewGroup viewGroup) {
        return (androidx.transition.Scene) viewGroup.getTag(androidx.transition.R.id.transition_current_scene);
    }

    public void setEnterAction(java.lang.Runnable runnable) {
        this.mEnterAction = runnable;
    }

    public void setExitAction(java.lang.Runnable runnable) {
        this.mExitAction = runnable;
    }

    boolean isCreatedFromLayoutResource() {
        return this.mLayoutId > 0;
    }
}
