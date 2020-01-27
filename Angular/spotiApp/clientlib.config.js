module.exports = {
    // default working directory (can be changed per 'cwd' in every asset option)
    context: __dirname,
 
    // path to the clientlib root folder (output)
    clientLibRoot: "./../ui.apps/src/main/content/jcr_root/apps/gnp-portal-publico/clientlibs",
 
    libs: {
        name: "spotiApp",
        allowProxy: true,
        categories: ["gnp-portal-publico.angular"],
        serializationFormat: "xml",
        jsProcessor: ["default:none","min:none"],
        assets: {
            js: [
                "dist/gnp-portal-publico/**/*.js"
            ],
            css: [
                "dist/gnp-portal-publico/**/*.css"
            ]
        }
    }
};