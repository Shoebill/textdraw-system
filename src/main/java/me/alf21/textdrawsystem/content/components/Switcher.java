package me.alf21.textdrawsystem.content.components;

import me.alf21.textdrawsystem.content.Content;

/**
 * Created by Alf21 on 27.02.2016 in the project 'textdraw-system'.
 */
public class Switcher extends Component {

	protected Switcher(Content content, ComponentAlignment componentAlignment, String name) {
		super(content, componentAlignment, name);
	}

	@Override
	public void destroy() {

	}

	@Override
	public boolean isDestroyed() {
		return false;
	}
}