package by9ye.recipe.recipewebapp.service;

import by9ye.recipe.recipewebapp.model.Recipe;
import by9ye.recipe.recipewebapp.repository.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@Service
public class ImageServiceImpl implements ImageService {

    private final RecipeRepository recipeRepository;

    public ImageServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Transactional
    @Override
    public void saveImageFile(Long id, MultipartFile file) {
        try {
            Recipe recipe = recipeRepository.findById(id).get();

            Byte[] bytes = new Byte[file.getBytes().length];

            int i = 0;

            for (byte b : file.getBytes()) {
                bytes[i++] = b;
            }

            recipe.setImage(bytes);

            recipeRepository.save(recipe);

        }
        catch (IOException e) {
            log.debug("error", e);
            e.printStackTrace();
        }
    }
}
