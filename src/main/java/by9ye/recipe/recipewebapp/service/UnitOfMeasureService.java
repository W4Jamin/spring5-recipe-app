package by9ye.recipe.recipewebapp.service;

import by9ye.recipe.recipewebapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();

}
