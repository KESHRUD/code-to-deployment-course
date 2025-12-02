<html>
    <head>
        <title>My Shop</title>
    </head>
    <body>
        <h1>la liste des produits dispo est :</h1>
        <ul>
            <?php

            $json = file_get_contents('http://product-service/');
            $obj = json_decode($json);

            $products = $obj->products;

            foreach ($products as $product) {
                echo "<li>$product</li>";
            }
            ?>
        </ul>
    </body>
</html>