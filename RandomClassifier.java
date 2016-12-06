package socialmedia;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Random;

public class RandomClassifier extends Experimenter {
 
	public Map<SocialMediaEntry, Boolean> classifyEntries(Set<SocialMediaEntry> trainingSet,
            Set<SocialMediaEntry> testSet) {
        
        System.out.println("Running classifier...");
        
        Map<SocialMediaEntry, Boolean> results = new HashMap<>();
        
        for (SocialMediaEntry entry : testSet) {
            results.put(entry, new Random().nextBoolean());
        }
        
        return results;
    }
}