package rotaryinformatorapp.com.rotaryinformatorapp;

import android.app.Application;
import android.content.Context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import rotaryinformatorapp.com.rotaryinformatorapp.model.Category;
import rotaryinformatorapp.com.rotaryinformatorapp.model.SubCategory;

/**
 * Created by Vladimir on 5/5/2016.
 */
public class App extends Application {

    private static List<Category> categories = Collections.emptyList();
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        createCategories();
        context = getApplicationContext();
    }

    /**
     * get application context
     *
     * @return
     */
    public static Context getContext() {
        return context;
    }

    /**
     * get categories
     *
     * @return
     */
    public static List<Category> getCategories() {
        return categories;
    }

    private void createCategories() {
        categories = new ArrayList<>(8);
        /**
         *mvr
         */
        initMVRCategory();

        /**
         *sud
         */
        initSUDCategory();

        /**
         *katastar
         */
        initKATASTARCategory();

        /**
         * UJP
         */
        initUJPCategory();

        /**
         * MATICNO
         */
        initMATICNOCategory();

        /**
         * FZO
         */
        initFZOCategory();

        /**
         * PIOM
         */
        initPIOMCategory();

        /**
         * About rotary
         */
        initAboutRotaryCategory();
    }

    private void initSUDCategory() {
        Category category = new Category(1, getString(R.string.category_sud), R.drawable.ic_description_black_36dp, R.color.colorAccent, R.color.colorAccent);
        for (int i = 0; i < getResources().getTextArray(R.array.category_sud).length; i++) {
            category.addSubCategory(new SubCategory(i, getResources().getStringArray(R.array.category_sud)[i], getResources().getStringArray(R.array.documents_sud)[i], R.color.colorPrimary));

        }
        categories.add(category);
    }

    private void initMVRCategory() {
        Category category = new Category(1, getString(R.string.category_mvr), R.drawable.ic_description_black_36dp, R.color.ujpStatusBar, R.color.ujpActionBar);
        for (int i = 0; i < getResources().getTextArray(R.array.category_mvr).length; i++) {
            category.addSubCategory(new SubCategory(i, getResources().getStringArray(R.array.category_mvr)[i], getResources().getStringArray(R.array.documents_mvr)[i], R.color.ujpIndicator));

        }
        categories.add(category);
    }

    private void initUJPCategory() {
        Category category = new Category(1, getString(R.string.category_ujp), R.drawable.ic_description_black_36dp, R.color.ujpStatusBar, R.color.ujpActionBar);
        for (int i = 0; i < getResources().getTextArray(R.array.category_ujp).length; i++) {
            category.addSubCategory(new SubCategory(i, getResources().getStringArray(R.array.category_ujp)[i], getResources().getStringArray(R.array.documents_ujp)[i], R.color.ujpIndicator));

        }
        categories.add(category);
    }

    private void initMATICNOCategory() {
        Category category = new Category(1, getString(R.string.category_maticno), R.drawable.ic_description_black_36dp, R.color.colorAccent, R.color.colorAccent);
        for (int i = 0; i < getResources().getTextArray(R.array.category_maticno).length; i++) {
            category.addSubCategory(new SubCategory(i, getResources().getStringArray(R.array.category_maticno)[i], getResources().getStringArray(R.array.documents_maticno)[i], R.color.colorPrimary));

        }
        categories.add(category);
    }

    private void initKATASTARCategory() {
        Category category = new Category(1, getString(R.string.category_katastar), R.drawable.ic_description_black_36dp, R.color.colorAccent, R.color.colorAccent);
        for (int i = 0; i < getResources().getTextArray(R.array.category_katastar).length; i++) {
            category.addSubCategory(new SubCategory(i, getResources().getStringArray(R.array.category_katastar)[i], getResources().getStringArray(R.array.documents_katastar)[i], R.color.colorPrimaryDark));

        }
        categories.add(category);
    }

    private void initFZOCategory() {
        Category category = new Category(1, getString(R.string.category_fzo), R.drawable.ic_description_black_36dp, R.color.colorAccent, R.color.colorAccent);
        for (int i = 0; i < getResources().getTextArray(R.array.category_fzo).length; i++) {
            category.addSubCategory(new SubCategory(i, getResources().getStringArray(R.array.category_fzo)[i], getResources().getStringArray(R.array.documents_fzo)[i], R.color.colorPrimary));

        }
        categories.add(category);
    }

    private void initPIOMCategory() {
        Category category = new Category(1, getString(R.string.category_piom), R.drawable.ic_description_black_36dp, R.color.colorAccent, R.color.colorAccent);
        for (int i = 0; i < getResources().getTextArray(R.array.category_piom).length; i++) {
            category.addSubCategory(new SubCategory(i, getResources().getStringArray(R.array.category_piom)[i], getResources().getStringArray(R.array.documents_piom)[i], R.color.colorAccent));

        }
        categories.add(category);
    }

    private void initAboutRotaryCategory() {
        Category category = new Category(99, getString(R.string.category_about_rotary), R.drawable.ic_description_black_36dp, R.color.colorAccent, R.color.colorAccent);

        categories.add(category);
    }
}
