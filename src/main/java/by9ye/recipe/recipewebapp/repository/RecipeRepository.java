package by9ye.recipe.recipewebapp.repository;

import by9ye.recipe.recipewebapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
