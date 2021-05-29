package com.savitrisekar.jogjatasty

import com.example.jogjatasty.R

object FoodData {
    private val categoriesName = arrayOf(
        "Beef",
        "Chicken",
        "Dessert",
        "Lamb",
        "Breakfast",
        "Pasta",
        "Pork",
        "Seafood",
        "Side",
        "Vegan"
    )

    private val foodName = arrayOf(
        "Beef Wellington",
        "Chicken Karaage",
        "Blackberry Fool",
        "Lamb and Potato pie",
        "English Breakfast",
        "Lasagne",
        "Wontons",
        "Honey Teriyaki Salmon",
        "Kumpir",
        "Vegan Lasagna"
    )

    private val foodArea = arrayOf(
        "British",
        "Japanese",
        "British",
        "British",
        "British",
        "Italian",
        "Chinese",
        "Japanese",
        "Turkish",
        "Italian"
    )

    private val foodTags = arrayOf(
        "Meat, Stew",
        "Fried, Chicken",
        "Desert, Summer, Fruity, Dairy",
        "Pie",
        "Breakfast",
        "Main course",
        "MainMeal",
        "Fish, Breakfast, DateNight",
        "SideDish",
        "Vegan, Pasta"
    )

    private val foodInstructions = arrayOf(
        "Put the mushrooms into a food processor with some seasoning and pulse to a rough paste. Scrape the paste into a pan and cook over a high heat for about 10 mins, tossing frequently, to cook out the moisture from the mushrooms. Spread out on a plate to cool. Heat in a frying pan and add a little olive oil. Season the beef and sear in the hot pan for 30 secs only on each side. (You don't want to cook it at this stage, just colour it). Remove the beef from the pan and leave to cool, then brush all over with the mustard. Lay a sheet of cling film on a work surface and arrange the Parma ham slices on it, in slightly overlapping rows. With a palette knife, spread the mushroom paste over the ham, then place the seared beef fillet in the middle. Keeping a tight hold of the cling film from the edge, neatly roll the Parma ham and mushrooms around the beef to form a tight barrel shape. Twist the ends of the cling film to secure. Chill for 15-20 mins to allow the beef to set and keep its shape. Roll out the puff pastry on a floured surface to a large rectangle, the thickness of a £1 coin. Remove the cling film from the beef, then lay in the centre. Brush the surrounding pastry with egg yolk. Fold the ends over, the wrap the pastry around the beef, cutting off any excess. Turn over, so the seam is underneath, and place on a baking sheet. Brush over all the pastry with egg and chill for about 15 mins to let the pastry rest. Heat the oven to 200C, 400F, gas 6. Lightly score the pastry at 1cm intervals and glaze again with beaten egg yolk. Bake for 20 minutes, then lower the oven setting to 180C, 350F, gas 4 and cook for another 15 mins. Allow to rest for 10-15 mins before slicing and serving with the side dishes of your choice. The beef should still be pink in the centre when you serve it.",
        "Add the ginger, garlic, soy sauce, sake and sugar to a bowl and whisk to combine. Add the chicken, then stir to coat evenly. Cover and refrigerate for at least 1 hour.\n" + "Add 1 inch of vegetable oil to a heavy bottomed pot and heat until the oil reaches 360 degrees F. Line a wire rack with 2 sheets of paper towels and get your tongs out. Put the potato starch in a bowl, Add a handful of chicken to the potato starch and toss to coat each piece evenly. Fry the karaage in batches until the exterior is a medium brown and the chicken is cooked through. Transfer the fried chicken to the paper towel lined rack. If you want the karaage to stay crispy longer, you can fry the chicken a second time, until it's a darker color after it's cooled off once. Serve with lemon wedges.",
        "For the biscuits, preheat the oven to 200C/180C (fan)/Gas 6 and line two large baking trays with baking parchment. Scatter the nuts over a baking tray and roast in the oven for 6-8 minutes, or until golden-brown. Watch them carefully so that they don’t have a chance to burn. Remove from the oven, tip onto a board and leave to cool. Put the butter and sugar in a large bowl and beat with a wooden spoon until light and creamy. Roughly chop the cooled nuts and add to the creamed butter and sugar, along with the lemon zest, flour and baking powder. Stir well until the mixture comes together and forms a ball – you may need to use your hands.\n" + "Divide the biscuit dough into 24 even pieces and roll into small balls. Place the balls the prepared baking trays, spaced well apart to allow for spreading. Press the biscuits to flatten to around 1cm/½in thick. Bake the biscuits, one tray at a time, for 12 minutes or until very pale golden-brown. Leave to cool on the trays. They will be very soft when you take them out of the oven, but will crisp as they cool. Store in an airtight tin and eat within five days. For the fool, rinse the blackberries in a colander to wash away any dust or dirt. Put the blackberries in a non-stick saucepan and sprinkle over the caster sugar. Stir in the lemon juice and heat gently for two minutes, or until the blackberries begin to soften and release their juices. Remove and reserve 12 blackberries for decoration and continue cooking the rest. Simmer the blackberries very gently for 15 minutes, stirring regularly until very soft and squidgy. Remove from the heat and press the berries and juice through a sieve over a bowl, using the bottom of a ladle to help you extract as much of the purée as possible. Leave the purée to cool and discard the seeds. You should end up with around 325ml/11fl oz of purée. Put the cream and yoghurt in a large bowl and whip with an electric whisk until soft peaks form when the whisk is removed from the bowl – the acidity of the fruit will thicken the cream further, so don’t take it too far. When the purée is completely cold, adjust the sweetness to taste by adding more sugar if needed. Pour it into the bowl with the whipped cream and yoghurt and stir just once or twice until very lightly combined. Spoon the blackberry fool into individual wide, glass dishes – or one large, single bowl. It should look quite marbled, so don’t over-stir it. Scatter a few tiny mint leaves on top and decorate with the reserved blackberries. Sprinkle with a little sugar if you like and serve with the hazelnut biscuits.",
        "Dust the meat with flour to lightly coat.\n" + "Heat enough vegetable oil in a large saucepan to fill the base, and fry the onion and meat until lightly browned. Season with salt and pepper. Add the carrots, stock and more seasoning to taste.\n" + "Bring to the boil, cover and reduce the heat to a simmer. Simmer for at least an hour or until the meat is tender. Take your time cooking the meat, the longer you leave it to cook, the better the flavour will be. Preheat the oven to 180C/350F/Gas 4. Add the drained potato cubes to the lamb. Turn the mixture into a pie dish or casserole and cover with the shortcrust pastry. Make three slits in the top of the pastry to release any steam while cooking. Brush with beaten egg and bake for about 40 minutes, until the pastry is golden brown. Serve.",
        "Heat the flat grill plate over a low heat, on top of 2 rings/flames if it fits, and brush sparingly with light olive oil.\n" + "Cook the sausages first. Add the sausages to the hot grill plate/the coolest part if there is one and allow to cook slowly for about 15-20 minutes, turning occasionally, until golden. After the first 10 minutes, increase the heat to medium before beginning to cook the other ingredients. If you are struggling for space, completely cook the sausages and keep hot on a plate in the oven. Snip a few small cuts into the fatty edge of the bacon. Place the bacon straight on to the grill plate and fry for 2-4 minutes each side or until your preferred crispiness is reached. Like the sausages, the cooked bacon can be kept hot on a plate in the oven. For the mushrooms, brush away any dirt using a pastry brush and trim the stalk level with the mushroom top. Season with salt and pepper and drizzle over a little olive oil. Place stalk-side up on the grill plate and cook for 1-2 minutes before turning and cooking for a further 3-4 minutes. Avoid moving the mushrooms too much while cooking, as this releases the natural juices, making them soggy. For the tomatoes, cut the tomatoes across the centre/or in half lengthways if using plum tomatoes , and with a small, sharp knife remove the green 'eye'. Season with salt and pepper and drizzle with a little olive oil. Place cut-side down on the grill plate and cook without moving for 2 minutes. Gently turn over and season again. Cook for a further 2-3 minutes until tender but still holding their shape. For the black pudding, cut the black pudding into 3-4 slices and remove the skin. Place on the grill plate and cook for 1½-2 minutes each side until slightly crispy. For 'proper' fried bread it's best to cook it in a separate pan. Ideally, use bread that is a couple of days old. Heat a frying pan to a medium heat and cover the base with oil. Add the bread and cook for 2-3 minutes each side until crispy and golden. If the pan becomes too dry, add a little more oil. For a richer flavour, add a knob of butter after you turn the slice. For the fried eggs, break the egg straight into the pan with the fried bread and leave for 30 seconds. Add a good knob of butter and lightly splash/baste the egg with the butter when melted. Cook to your preferred stage, season and gently remove with a fish slice. Once all the ingredients are cooked, serve on warm plates and enjoy straight away with a good squeeze of tomato ketchup or brown sauce.",
        "Heat the oil in a large saucepan. Use kitchen scissors to snip the bacon into small pieces, or use a sharp knife to chop it on a chopping board. Add the bacon to the pan and cook for just a few mins until starting to turn golden. Add the onion, celery and carrot, and cook over a medium heat for 5 mins, stirring occasionally, until softened. Add the garlic and cook for 1 min, then tip in the mince and cook, stirring and breaking it up with a wooden spoon, for about 6 mins until browned all over. Stir in the tomato purée and cook for 1 min, mixing in well with the beef and vegetables. Tip in the chopped tomatoes. Fill each can half full with water to rinse out any tomatoes left in the can, and add to the pan. Add the honey and season to taste. Simmer for 20 mins. Heat oven to 200C/180C fan/gas 6. To assemble the lasagne, ladle a little of the ragu sauce into the bottom of the roasting tin or casserole dish, spreading the sauce all over the base. Place 2 sheets of lasagne on top of the sauce overlapping to make it fit, then repeat with more sauce and another layer of pasta. Repeat with a further 2 layers of sauce and pasta, finishing with a layer of pasta. Put the crème fraîche in a bowl and mix with 2 tbsp water to loosen it and make a smooth pourable sauce. Pour this over the top of the pasta, then top with the mozzarella. Sprinkle Parmesan over the top and bake for 25–30 mins until golden and bubbling. Serve scattered with basil, if you like.",
        "Combine pork, garlic, ginger, soy sauce, sesame oil, and vegetables in a bowl.\n" + "Separate wonton skins.\n" + "Place a heaping teaspoon of filling in the center of the wonton.\n" + "Brush water on 2 borders of the skin, covering 1/4 inch from the edge.\n" + "Fold skin over to form a triangle, sealing edges. Pinch the two long outside points together. Heat oil to 450 degrees and fry 4 to 5 at a time until golden. Drain and serve with sauce.",
        "Mix all the ingredients in the Honey Teriyaki Glaze together. Whisk to blend well. Combine the salmon and the Glaze together.\n" + "Heat up a skillet on medium-low heat. Add the oil, Pan-fry the salmon on both sides until it’s completely cooked inside and the glaze thickens. Garnish with sesame and serve immediately.",
        "If you order kumpir in Turkey, the standard filling is first, lots of butter mashed into the potato, followed by cheese. There’s then a row of other toppings that you can just point at to your heart’s content – sweetcorn, olives, salami, coleslaw, Russian salad, allsorts – and you walk away with an over-stuffed potato because you got ever-excited by the choices on offer. Grate (roughly – you can use as much as you like) 150g of cheese. Finely chop one onion and one sweet red pepper. Put these ingredients into a large bowl with a good sprinkling of salt and pepper, chilli flakes (optional).",
        "1) Preheat oven to 180 degrees celcius.\n" + "2) Boil vegetables for 5-7 minutes, until soft. Add lentils and bring to a gentle simmer, adding a stock cube if desired. Continue cooking and stirring until the lentils are soft, which should take about 20 minutes.\n" + "3) Blanch spinach leaves for a few minutes in a pan, before removing and setting aside.\n" + "4) Top up the pan with water and cook the lasagne sheets. When cooked, drain and set aside.\n" + "5) To make the sauce, melt the butter and add the flour, then gradually add the soya milk along with the mustard and the vinegar. Cook and stir until smooth and then assemble the lasagne as desired in a baking dish.\n" + "6) Bake in the preheated oven for about 25 minutes."
    )

    private val foodIngredients = arrayOf(
        "1) mushrooms - 400g\n" +
                "2) English Mustard - 1-2tbsp\n" +
                "3) Olive Oil - Dash\n" +
                "4) Beef Fillet - 750g piece\n" +
                "5) Parma ham - 6-8 slices\n" +
                "6) Puff Pastry - 500g\n" +
                "7) Flour - Dusting\n" +
                "8) Egg Yolks - 2 Beaten\n",
        "1) Chicken thigh - 450 grams Boneless skin\n" +
                "2) Ginger - 1 tablespoon\n" +
                "3) Garlic - 1 clove\n" +
                "4) Soy sauce - 2 tablespoons\n" +
                "5) Sake - 1 tablespoon\n" +
                "6) Granulated sugar - 2 teaspoon\n" +
                "7) Potato starch - 1/3 cup\n" +
                "8) Vegetable oil - 1/3 cup\n" +
                "9) Lemon - 1/3 cup\n",
        "1) Hazlenuts - 50g\n" +
                "2) Butter - 125g\n" +
                "3) Caster Sugar - 150g\n" +
                "4) Lemon - Grated\n" +
                "5) Plain Flour - 150g\n" +
                "6) Baking Powder - ½ tsp\n" +
                "7) Blackberrys - 600g\n" +
                "8) Sugar - 75g\n" +
                "9) Caster Sugar - 2 tbs\n" +
                "10) Lemon Juice - 1 tbs\n" +
                "11) Double Cream - 300ml\n" +
                "12) Yogurt - 100ml\n" +
                "13) Mint - Garnish with\n",
        "1) Lamb Shoulder - 500g\n" +
                "2) Flour - 1 tbls\n" +
                "3) Vegetable Oil - Dash\n" +
                "4) Onion - 1 sliced\n" +
                "5) Carrots - 2 sliced\n" +
                "6) Vegetable Stock - 350ml/12fl\n" +
                "7) Potatoes - 500g\n" +
                "8) Shortcrust Pastry - 450g\n" +
                "9) Eggs - To Glaze\n",
        "1) Sausages - 2\n" +
                "2) Bacon - 3\n" +
                "3) Mushrooms - 2\n" +
                "4) Tomatoes - 2\n" +
                "5) Black Pudding - 1 Slice\n" +
                "6) Eggs - 2\n" +
                "7) Bread - 1 Slice\n",
        "1) Olive Oil - 1 tblsp\n" +
                "2) Bacon - 2\n" +
                "3) Onion - 1 finely chopped\n" +
                "4) Celery - 1 Stick\n" +
                "5) Carrots - 1 medium\n" +
                "6) Garlic - 2 cloves chopped\n" +
                "7) Minced Beef - 500g\n" +
                "8) Tomato Puree - 1 tbls\n" +
                "9) Chopped Tomatoes - 800g\n" +
                "10) Honey - 1 tblsp\n" +
                "11) Lasagne Sheets - 500g\n" +
                "12) Creme Fraiche - 400ml\n" +
                "13) Mozzarella Balls - 125g\n" +
                "14) Parmesan Cheese - 50g\n" +
                "15) Basil Leaves - Topping\n",
        "1) Pork - 1lb\n" +
                "2) Garlic Clove - 3 chopped\n" +
                "3) Ginger - 1 tsp\n" +
                "4) Soy Sauce - 1 tbs\n" +
                "5) Sesame Seed Oil - 1 tsp\n" +
                "6) Carrots - 3 finely chopped\n" +
                "7) Celery - 3 finely chopped\n" +
                "8) Spring Onions - 6 chopped\n" +
                "9) Wonton Skin - 1 Packet\n" +
                "10) Oil - Fry\n" +
                "11) Water - Bottle",
        "1) Salmon - 1 lb\n" +
                "2) Olive oil - 1 tablespoon\n" +
                "3) Soy Sauce - 2 tablespoons\n" +
                "4) Sake - 2 tablespoons\n" +
                "5) Sesame Seed - 4 tablespoons",
        "1) Potatoes - 2 large\n" +
                "2) Butter - 2 tbs\n" +
                "3) Cheese - 150g\n" +
                "4) Onion - 1 large\n" +
                "5) Red Pepper - 1 large\n" +
                "6) Red Chile Flakes - Pinch",
        "1) Green red lentils - 1 cups\n" +
                "2) Carrot - 1\n" +
                "3) Onion - 1\n" +
                "4) Zucchini - 1 small\n" +
                "5) Coriander - sprinking\n" +
                "6) Spinach - 150g\n" +
                "7) Lasagne sheets - 10\n" +
                "8) Vegan butter - 35g\n" +
                "9) Flour - 4 tablespoons\n" +
                "10) Soya milk - 300ml\n" +
                "11) Mustard - 1.5 teaspoons\n" +
                "12) Vinegar - 1 teaspoon\n"
    )

    private val foodImage = intArrayOf(
        R.drawable.ic_beef_wellington,
        R.drawable.ic_chicken_karaage,
        R.drawable.ic_blackberry_fool,
        R.drawable.ic_lamb_potato_pie,
        R.drawable.ic_english_breakfast,
        R.drawable.ic_lasagne,
        R.drawable.ic_wontons,
        R.drawable.ic_honey_teriyaki_salmon,
        R.drawable.ic_kumpir,
        R.drawable.ic_vegan_lasagna
    )

    val listFoodData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.name = foodName[position]
                food.category = categoriesName[position]
                food.area = foodArea[position]
                food.tags = foodTags[position]
                food.instructions = foodInstructions[position]
                food.ingredients = foodIngredients[position]
                food.image = foodImage[position]
                list.add(food)
            }
            return list
        }
}