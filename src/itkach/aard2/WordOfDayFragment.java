package itkach.aard2;

public class WordOfDayFragment extends BlobDescriptorListFragment {
    @Override
    BlobDescriptorList getDescriptorList() {
        Application app = (Application) getActivity()
                .getApplication();
        return app.words;
    }

    @Override
    String getItemClickAction() {
        return "showWordOfDay";
    }

    @Override
    int getDeleteConfirmationItemCountResId() {
        return R.plurals.confirm_delete_history_count;
    }

    @Override
    String getPreferencesNS() {
        return "Word of day";
    }

    @Override
    int getEmptyIcon() {
        return R.xml.ic_empty_view_word;
    }

    @Override
    CharSequence getEmptyText() {
        return getString(R.string.main_empty_word);
    }
}
