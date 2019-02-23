package by9ye.recipe.recipewebapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    //If the association is bidirectional,
    // one side has to be the owner and one side has to be the inverse end
    @ManyToMany(mappedBy = "categories") // this is the inverse
    private Set<Recipe> recipes;

}
