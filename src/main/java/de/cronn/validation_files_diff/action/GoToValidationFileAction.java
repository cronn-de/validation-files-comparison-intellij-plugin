package de.cronn.validation_files_diff.action;

import com.intellij.codeInsight.CodeInsightActionHandler;
import com.intellij.codeInsight.actions.BaseCodeInsightAction;
import org.jetbrains.annotations.NotNull;

public class GoToValidationFileAction extends BaseCodeInsightAction {

	@Override
	@NotNull
	public CodeInsightActionHandler getHandler() {
		return new GoToValidationFileHandler();
	}
}
