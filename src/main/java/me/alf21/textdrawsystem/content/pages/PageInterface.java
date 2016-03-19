package me.alf21.textdrawsystem.content.pages;

import me.alf21.textdrawsystem.content.Content;

/**
 * Created by Alf21 on 02.03.2016 in the project 'textdraw-system'.
 */
public interface PageInterface {

	default void onReach(Content content, Page page) {

	}

	default void onLeave(Content content, Page page) {

	}
}
