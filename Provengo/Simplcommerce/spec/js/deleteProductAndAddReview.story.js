// @provengo summon selenium

story('delete the product from Simplcommerce', function() {
    let s = new SeleniumSession().start('https://ci.simplcommerce.com/login')
    s.loginAdmin({email: 'admin@simplcommerce.com', password: '1qazZAQ!'})
    s.navigateToProducts()
    s.deleteProduct()
})

story('Add a review to the product on Simplcommerce', function() {
    let s = new SeleniumSession().start('https://ci.simplcommerce.com/login')
    s.loginUser({email: 'rotem3@post.bgu.ac.il', password: 'Rotem123!'})
    s.navigateToTheProduct()
    s.addReview({comment: "Great Iphone, didn't know there is an iphone 100!! nice to know!", title: "Great Iphone!"})
})