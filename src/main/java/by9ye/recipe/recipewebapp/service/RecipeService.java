package by9ye.recipe.recipewebapp.service;

import by9ye.recipe.recipewebapp.commands.RecipeCommand;
import by9ye.recipe.recipewebapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipe();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
