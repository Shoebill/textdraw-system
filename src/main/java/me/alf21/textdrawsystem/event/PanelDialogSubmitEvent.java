/**
 * Copyright (C) 2011 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.alf21.textdrawsystem.event;

import me.alf21.textdrawsystem.panelDialog.AbstractPanelDialog;
import me.alf21.textdrawsystem.panelDialog.PanelDialog;
import net.gtaun.shoebill.object.Player;
import net.gtaun.util.event.Event;

/**
 *
 *
 * @author Alf21
 */
public class PanelDialogSubmitEvent extends PanelDialogEvent
{
	private PanelDialog oldPanelDialog;

	protected PanelDialogSubmitEvent(AbstractPanelDialog panelDialog, Player player, PanelDialog oldPanelDialog) {
		super(panelDialog, player);
		this.oldPanelDialog = oldPanelDialog;
	}

	public PanelDialog getOldPanelDialog() {
		return oldPanelDialog;
	}

	public void submit(AbstractPanelDialog panelDialog, PanelDialog oldPanelDialog) {

	}
}
