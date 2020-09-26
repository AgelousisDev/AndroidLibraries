package com.agelousis.materialsearchview.databinding;
import com.agelousis.materialsearchview.R;
import com.agelousis.materialsearchview.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MaterialSearchViewLayoutBindingImpl extends MaterialSearchViewLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchIcon, 3);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MaterialSearchViewLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private MaterialSearchViewLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.profileImageView.setTag(null);
        this.searchField.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.materialSearchViewDataModel == variableId) {
            setMaterialSearchViewDataModel((com.agelousis.materialsearchview.models.MaterialSearchViewDataModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMaterialSearchViewDataModel(@Nullable com.agelousis.materialsearchview.models.MaterialSearchViewDataModel MaterialSearchViewDataModel) {
        this.mMaterialSearchViewDataModel = MaterialSearchViewDataModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.materialSearchViewDataModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.util.List<java.lang.Byte> materialSearchViewDataModelIconFromByteArray = null;
        android.graphics.Bitmap materialSearchViewDataModelIconFromBitmap = null;
        java.lang.Integer materialSearchViewDataModelIconFromVectorResourceId = null;
        java.lang.Integer materialSearchViewDataModelIconFromResourceId = null;
        java.io.File materialSearchViewDataModelIconFromFile = null;
        java.lang.String materialSearchViewDataModelHint = null;
        com.agelousis.materialsearchview.models.MaterialSearchViewDataModel materialSearchViewDataModel = mMaterialSearchViewDataModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (materialSearchViewDataModel != null) {
                    // read materialSearchViewDataModel.iconFromByteArray
                    materialSearchViewDataModelIconFromByteArray = materialSearchViewDataModel.getIconFromByteArray();
                    // read materialSearchViewDataModel.iconFromBitmap
                    materialSearchViewDataModelIconFromBitmap = materialSearchViewDataModel.getIconFromBitmap();
                    // read materialSearchViewDataModel.iconFromVectorResourceId
                    materialSearchViewDataModelIconFromVectorResourceId = materialSearchViewDataModel.getIconFromVectorResourceId();
                    // read materialSearchViewDataModel.iconFromResourceId
                    materialSearchViewDataModelIconFromResourceId = materialSearchViewDataModel.getIconFromResourceId();
                    // read materialSearchViewDataModel.iconFromFile
                    materialSearchViewDataModelIconFromFile = materialSearchViewDataModel.getIconFromFile();
                    // read materialSearchViewDataModel.hint
                    materialSearchViewDataModelHint = materialSearchViewDataModel.getHint();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.agelousis.materialsearchview.extensions.ExtensionsKt.setImageFromByteArray(this.profileImageView, materialSearchViewDataModelIconFromByteArray);
            com.agelousis.materialsearchview.extensions.ExtensionsKt.setImageFromBitmap(this.profileImageView, materialSearchViewDataModelIconFromBitmap);
            com.agelousis.materialsearchview.extensions.ExtensionsKt.setImageFromFile(this.profileImageView, materialSearchViewDataModelIconFromFile);
            com.agelousis.materialsearchview.extensions.ExtensionsKt.setImageFromResourceId(this.profileImageView, materialSearchViewDataModelIconFromResourceId);
            com.agelousis.materialsearchview.extensions.ExtensionsKt.setImageFromVectorResourceId(this.profileImageView, materialSearchViewDataModelIconFromVectorResourceId);
            this.searchField.setHint(materialSearchViewDataModelHint);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): materialSearchViewDataModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}