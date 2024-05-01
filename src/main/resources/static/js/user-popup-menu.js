function userPopupMenu() {
    return {
        show: false,
        toggleVisibility() {
            this.show = !this.show;
        },
        close() {
            this.show = false;
        },
        isVisible() {
            return this.show === true;
        }
    };
}

changeLanguage = function(event) {
    var button = event.target;
    var newText = this.language === 'en' ? 'नेपाली' : 'English';
    this.language = this.language === 'en' ? 'np' : 'en';
    button.querySelector('span').innerText = newText;
    console.log("Selected Language: ", selectedLanguage);
    window.location.search = 'lang=' + language;

};