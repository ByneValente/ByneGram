package org.bynegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.LayoutHelper;

public class TestMenu extends BaseFragment {

    @Override
    public View createView(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // Простая тестовая кнопка
        TextCell testCell = new TextCell(context);
        testCell.setTextAndIcon("Тест ByneGram настроек", 0, true);
        testCell.setOnClickListener(v -> {
            // Открываем наши настройки
            presentFragment(new ByneGramSettings());
        });
        linearLayout.addView(testCell, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        return linearLayout;
    }
}