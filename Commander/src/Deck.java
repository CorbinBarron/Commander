import java.util.ArrayList;

public class Deck
{
    public ArrayList<Card> aDeck = new ArrayList<Card>();

    public Deck()
    {
    }

    public Deck(ArrayList<Card> deck)
    {
        this.aDeck = deck;
    }


    public String ShowDeck()
    {
        String setup = "";
        for (Card aCard : aDeck)
        {
            setup += "Card Name: " + aCard.getName() + "\n" +
                    "Color: " + aCard.getColor() + "\n" +
                    "CMC: " + aCard.getCmc() + "\n" +
                    "Type: " + aCard.getType() + "\n" +
                    "Power: " + aCard.getPower() + "\n" +
                    "Toughness: " + aCard.getToughness() + "\n"
                    + "-----------------------------" +"\n";


        }
        return setup;
    }

    public String ShowLands()
    {
        int lands = 0;
        String setup = "";
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Land")
            {
                lands++;
            }
        }
        System.out.println("----" + lands + " LANDS----");
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Land")
            {
                setup += "Card Name: " + aCard.getName() + "\n" + "-----------------------------" + "\n";
            }
        }
        return setup;
    }
    public String ShowCreatures()
    {
        int creatures = 0;
        String setup = "";
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Creature" || aCard.getType() == "Legendary Creature" || aCard.getType() == "Artifact Creature" || aCard.getType() == "Legendary Artifact Creature")
            {
                creatures++;
            }
        }
        System.out.println("----" + creatures + " CREATURES----");
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Creature" || aCard.getType() == "Legendary Creature" || aCard.getType() == "Artifact Creature" || aCard.getType() == "Legendary Artifact Creature")
            {
                setup += "Card Name: " + aCard.getName() + "\n" + "-----------------------------" + "\n";
            }

            creatures ++;
        }
        return setup;
    }

    public String ShowArtifacts()
    {
        int artifacts = 0;
        String setup = "";
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Artifact")
            {
                artifacts++;
            }
        }
        System.out.println("----" + artifacts + " ARTIFACTS----");
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Artifact")
            {
                setup += "Card Name: " + aCard.getName() + "\n" + "-----------------------------" + "\n";
            }

            artifacts ++;
        }
        return setup;
    }

    public String ShowEnchantments()
    {
        int enchantments = 0;
        String setup = "";
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Enchantment")
            {
                enchantments++;
            }
        }
        System.out.println("----" + enchantments +" ENCHANTMENTS----");
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Enchantment")
            {
                setup += "Card Name: " + aCard.getName() + "\n" + "-----------------------------" + "\n";
            }

            enchantments ++;
        }
        return setup;
    }

    public String ShowInstants()
    {
        int instants = 0;
        String setup = "";
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Instant")
            {
                instants++;
            }
        }
        System.out.println("----" + instants + " INSTANTS----");
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Instant")
            {
                setup += "Card Name: " + aCard.getName() + "\n" + "-----------------------------" + "\n";
            }

            instants ++;
        }
        return setup;
    }

    public String ShowSorceries()
    {
        int sorceries = 0;
        String setup = "";
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Sorcery")
            {
                sorceries++;
            }
        }
        System.out.println("----" + sorceries + " SORCERIES----");
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Sorcery")
            {
                setup += "Card Name: " + aCard.getName() + "\n" + "-----------------------------" + "\n";
            }

            sorceries ++;
        }
        return setup;
    }

    public String ShowPlaneswakers()
    {
        int planeswalkers = 0;
        String setup = "";
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Planeswalker")
            {
                planeswalkers++;
            }
        }
        System.out.println("----" + planeswalkers + " PLANESWALKERS----");
        for(Card aCard : aDeck)
        {
            if(aCard.getType() == "Planeswalker")
            {
                setup += "Card Name: " + aCard.getName() + "\n" + "-----------------------------" + "\n";
            }

            planeswalkers ++;
        }
        return setup;
    }
}


