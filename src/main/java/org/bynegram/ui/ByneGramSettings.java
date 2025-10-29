package org.bynegram.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;

import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.LayoutHelper;

public class ByneGramSettings extends BaseFragment {

    @Override
    public View createView(Context context) {
        // Создаем основной контейнер - вертикальный список
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));

        // Добавляем заголовок "Сообщество ByneGram"
        HeaderCell headerCell = new HeaderCell(context);
        headerCell.setText("Сообщество ByneGram");
        linearLayout.addView(headerCell, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        // Создаем кнопку для официального канала
        TextCell channelCell = new TextCell(context);
        channelCell.setTextAndIcon("Официальный канал", 0, true);
        channelCell.setOnClickListener(v -> {
            // При нажатии открываем ссылку на канал
            openUrl("https://t.me/bynegram");
        });
        linearLayout.addView(channelCell, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        // Создаем кнопку для группы обсуждений
        TextCell groupCell = new TextCell(context);
        groupCell.setTextAndIcon("Группа обсуждений", 0, true);
        groupCell.setOnClickListener(v -> {
            // При нажатии открываем ссылку на группу
            openUrl("https://t.me/bynegramgroup");
        });
        linearLayout.addView(groupCell, LayoutHelper.createLinear(LayoutHelper.MATCH_PARENT, LayoutHelper.WRAP_CONTENT));

        return linearLayout;
    }

    private void openUrl(String url) {
        try {
            // Создаем намерение открыть ссылку
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        } catch (Exception e) {
            // Если ошибка (например, нет браузера)
            // Пока ничего не делаем, можно добавить сообщение об ошибке позже
        }
    }
}