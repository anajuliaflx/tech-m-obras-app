import NewFormLocalization from "../src/components/FormLocalization/newFormLocalization";
import Nav from "../src/components/Nav";
import Footer from "../src/components/patterns/Footer";
import HeadComponent from "../src/components/patterns/Head";
import styles from '../styles/Home.module.css'

export default function NewLocalization() {
  return (
    <div >
      <HeadComponent />
      <Nav />
      <NewFormLocalization />
      <Footer style={styles.footer} />
    </div>
  )
}