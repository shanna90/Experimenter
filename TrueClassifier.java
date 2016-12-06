 package socialmedia;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TrueClassifier extends Experimenter {
 
	public Map<SocialMediaEntry, Boolean> classifyEntries(Set<SocialMediaEntry> trainingSet,
            Set<SocialMediaEntry> testSet) {
        
        System.out.println("Running classifier...");
        
        Map<SocialMediaEntry, Boolean> results = new HashMap<>();
        
        for (SocialMediaEntry entry : testSet) {
            results.put(entry, true);
        }
        
        return results;
    }
}